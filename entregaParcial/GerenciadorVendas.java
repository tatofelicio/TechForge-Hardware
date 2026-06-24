import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorVendas {

    // O "Banco de Dados" que guarda todos os Cupons Fiscais
    private static final Map<String, Double> comissaoPorMatricula = new HashMap<>();
    private static final List<Venda> historicoVendas = new ArrayList<>();

    public static void iniciarVenda(Leitura l) {
        System.out.println("\n--- FRENTE DE CAIXA (NOVA VENDA) ---");
        System.out.println("\n--- OBS: VENDAS ACIMA DE R$5000 GERAM COMISSÃO AO VENDEDOR ---");
        // 1. Prepara o novo Cupom Fiscal
        Venda novaVenda = new Venda();

        // 2. Identificação
        System.out.println("[SISTEMA] Identificação:");
        boolean entradaValida;
        while (true) {
            try {
                novaVenda.getAtendente().setMatricula(l.entDados("Matrícula do Vendedor: ")); //REFLEXIVIDADE
                break; // Sai do loop se der certo
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        // Persistência para Nome do Vendedor
        while (true) {
            try {
                novaVenda.getAtendente().setNome(l.entDados("Nome do Vendedor: ")); //REFLEXIVIDADE
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        // Persistência para CPF do Cliente
        while (true) {
            try {
                novaVenda.getComprador().setCpf(l.entDados("CPF do Cliente: ")); //REFLEXIVIDADE
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        // Persistência para Nome do Cliente
        while (true) {
            try {
                novaVenda.getComprador().setNome(l.entDados("Nome do Cliente: ")); //REFLEXIVIDADE
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        // Persistência para Telefone do Cliente
        do {
            entradaValida = true;
            try {
                // Fazemos o cast (Cliente) para acessar o metodo setTelefone
                ((Cliente) novaVenda.getComprador()).setTelefone(l.entDados("Telefone do Cliente: ")); //REFLEXIVIDADE
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
                entradaValida = false;
            }
        } while (!entradaValida);

        // Persistência para Endereço de Entrega
        do {
            entradaValida = true;
            try {
                // Se o usuário apenas apertar ENTER, a sua classe Cliente já coloca "Retirada na Loja"
                ((Cliente) novaVenda.getComprador()).setEnderecoEntrega(l.entDados("Endereço de Entrega (Deixe em branco para Retirada na Loja): "));//REFLEXIVIDADE
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
                entradaValida = false;
            }
        } while (!entradaValida);

        // =================================================================
        // NOVA OPÇÃO: EXIBIÇÃO OPCIONAL DO CATÁLOGO
        // =================================================================
        boolean verCatalogo = TratamentoDeEntrada.lerSimOuNao(l, "\n[SISTEMA] Gostaria de abrir o catálogo de produtos? (S/N): ");
        if (verCatalogo) {
            // Reutiliza o metodo de relatório que você já tem pronto no estoque!
            GerenciadorEstoque.exibirRelatorio();
        }

        System.out.println("\n[SISTEMA] Carrinho Aberto! Catálogo físico liberado.");

        // 3. O "Bip" do Leitor de Código de Barras (Loop do Carrinho)
        while (true) {
            int idBusca = TratamentoDeEntrada.lerInteiroSeguro(l, "\nDigite o ID do produto para adicionar (ou 0 para finalizar a compra): ");

            if (idBusca == 0) {
                break; // Sai do loop e vai para o pagamento
            }

            // Pede para o GerenciadorEstoque procurar a peça
            Hardware produtoEncontrado = GerenciadorEstoque.buscarProduto(idBusca);

            if (produtoEncontrado == null) {
                System.out.println("[ERRO] Produto não encontrado! Verifique o ID.");
                continue;
            }

            if (produtoEncontrado.getQtdEstoque() <= 0) {
                System.out.println("[ERRO] A peça " + produtoEncontrado.getNome() + " está esgotada no estoque físico!");
                continue;
            }

            try {
                // Diminui 1 unidade do galpão físico
                int novoEstoque = produtoEncontrado.getQtdEstoque() - 1;
                produtoEncontrado.setQtdEstoque(novoEstoque);

                // Regra original do seu projeto: se zerar, remove da prateleira
                if (novoEstoque == 0) {
                    GerenciadorEstoque.getListaEstoque().remove(produtoEncontrado);
                }

                // Coloca no carrinho do cliente
                novaVenda.adicionarItem(produtoEncontrado);
                System.out.println("[SUCESSO] 1x " + produtoEncontrado.getNome() + " adicionado ao carrinho!");

            } catch (EstoqueInvalidoException e) {
                System.out.println("\n[ERRO INTERNO] Problema na baixa de estoque físico.");
            } catch(EstoqueExcedidoException ee){
                System.out.println("\n[ERRO INTERNO] Problema de estoque.");
            }
        }

        // 4. Fechamento de Caixa
        if (novaVenda.getCarrinho().isEmpty()) {
            System.out.println("\n[AVISO] Compra cancelada! O carrinho estava vazio.");
        } else {
            historicoVendas.add(novaVenda);
            double valorVenda = novaVenda.getValorTotal();
            int faixas = (int) (valorVenda / 5000); // quantas vezes bateu o patamar de 5000
            double bonus = faixas * 50.0;

            double acumuladoAtual = comissaoPorMatricula.getOrDefault(novaVenda.getAtendente().getMatricula(), 0.0); //Reflexividade
            comissaoPorMatricula.put(novaVenda.getAtendente().getMatricula(), acumuladoAtual + bonus); //Reflexividade
            imprimirCupom(novaVenda);
        }
    }

    // ==========================================
    // IMPRESSÃO DO RECIBO COM POLIMORFISMO
    // ==========================================
    private static void imprimirCupom(Venda v) {
        System.out.println("\n==========================================");
        System.out.println("               CUPOM FISCAL               ");
        System.out.println("==========================================");
        System.out.println("ID da Venda: " + String.format("%04d", v.getIdVenda()));
        System.out.println("Vendedor: " + v.getAtendente().getNome() + " (Matrícula: " + v.getAtendente().getMatricula() + ")"); //REFLEXIVIDADE

        // Faz o cast para exibir os dados do Cliente
        Cliente c = (Cliente) v.getComprador();
        System.out.println("Cliente: " + c.getNome() + " (CPF: " + c.getCpf() + ")");
        System.out.println("Contato: " + c.getTelefone());
        System.out.println("Entrega: " + c.getEnderecoEntrega());

        System.out.println("------------------------------------------");
        System.out.println("ITENS COMPRADOS:");

        for (Hardware item : v.getCarrinho()) {
            System.out.println("1x " + item.getNome() + " ......... R$ " + item.getPreco());
        }

        System.out.println("------------------------------------------");
        System.out.println("TOTAL A PAGAR: R$ " + v.getValorTotal());
        System.out.println("==========================================");
    }

    // ==========================================
    // RELATÓRIO GERAL DE VENDAS
    // ==========================================
    public static void exibirRelatorioVendas() {
        System.out.println("\n--- RELATÓRIO GERAL DE VENDAS ---");

        if (historicoVendas.isEmpty()) {
            System.out.println("Nenhuma venda foi realizada até o momento.");
            return;
        }

        double receitaTotalGeral = 0.0;

        // Varre todas as vendas registradas no sistema
        for (Venda v : historicoVendas) {
            System.out.println("\n---------------------------------");
            System.out.println("ID da Venda: " + String.format("%04d", v.getIdVenda()));
            System.out.println("Vendedor: " + v.getAtendente().getNome() + " (Matrícula: " + v.getAtendente().getMatricula() + ")"); //REFLEXIVIDADE
            System.out.println("Cliente: " + v.getComprador().getNome() + " (CPF: " + v.getComprador().getCpf() + ")"); //REFLEXIVIDADE
            System.out.println("Itens Comprados:");

            // Varre o carrinho de cada venda
            for (Hardware item : v.getCarrinho()) {
                System.out.println(" - 1x " + item.getNome() + " | R$ " + item.getPreco());
            }

            System.out.println("Total desta venda: R$ " + v.getValorTotal());

            // Acumula o dinheiro no cofre geral
            receitaTotalGeral += v.getValorTotal();
        }

        System.out.println("\n==========================================");
        System.out.println("RECEITA TOTAL DO SISTEMA: R$ " + receitaTotalGeral);
        System.out.println("==========================================");
    }

    // ==========================================
    // RELATÓRIO COMISSÕES
    // ==========================================

    public static void exibirRelatorioComissoes() {
        System.out.println("\n--- RELATÓRIO DE COMISSÕES POR VENDEDOR ---");
        if (comissaoPorMatricula.isEmpty()) {
            System.out.println("Nenhuma comissão registrada ainda.");
            return;
        }
        for (Map.Entry<String, Double> entry : comissaoPorMatricula.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() + " | Comissão acumulada: R$ " + entry.getValue());
        }
    }

}
