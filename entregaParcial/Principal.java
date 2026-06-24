//Aluno: Otávio Felício RA: 2768488
public class Principal {

    public static void exibirMenu(String usuario) {
        System.out.println("\n=== TECHFORGE HARDWARE | Operador: " + usuario + " ===");
    }

    public static void main(String[] args) {
        Leitura l = new Leitura();
        int opc = 0;

        System.out.println("\nINICIALIZANDO PROGRAMA...\n");
        String operador = l.entDados("DIGITE SEU NOME: ");
        exibirMenu(operador);

        do{
        System.out.println("\n[1] Cadastrar Processador");
        System.out.println("[2] Cadastrar Placa de Vídeo");
        System.out.println("[3] Cadastrar Memória RAM");
        System.out.println("[4] Cadastrar Placa-Mãe");
        System.out.println("[5] Frente de Caixa (Realizar Venda)");
        System.out.println("[6] Relatório de Estoque");
        System.out.println("[7] Relatório de Vendas");
        System.out.println("[8] Relatório de Comissoes");
        System.out.println("[0] Sair");

        opc = TratamentoDeEntrada.lerInteiroSeguro(l, "Escolha uma opcao: ");


        switch (opc) {
            case 1:
                GerenciadorEstoque.cadastrar(new Processador(), l);
                break;
            case 2:
                GerenciadorEstoque.cadastrar(new PlacaDeVideo(), l);
                break;
            case 3:
                GerenciadorEstoque.cadastrar(new MemoriaRam(), l);
                break;
            case 4:
                GerenciadorEstoque.cadastrar(new PlacaMae(), l);
                break;
            case 5:
                GerenciadorVendas.iniciarVenda(l);
                break;
            case 6:
                GerenciadorEstoque.exibirRelatorio();
                break;
            case 7:
                GerenciadorVendas.exibirRelatorioVendas();
                break;
            case 8:
                GerenciadorVendas.exibirRelatorioComissoes();
                break;
            case 0:
                System.out.println("Encerrando o sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while(opc != 0);
    }
}


