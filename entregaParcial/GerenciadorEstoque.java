//Aluno: Otávio Felício RA: 2768488
import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque {

    //auto-incremento de id
    private static int contadorId = 1;
    private static final List<Hardware> listaEstoque = new ArrayList<>();

    // ==========================================
    // SOBRECARGA 1: Cadastro de Processador
    // ==========================================

    //SOBRECARGA
    public static void cadastrar(Processador p, Leitura l) {
        System.out.println("\n--- NOVO PROCESSADOR ---");
        while (true) {
            try {
                p.setNome(l.entDados("Nome do Processador (String): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        try {
            p.setQtdEstoque(TratamentoDeEntrada.lerInteiroSeguro(l, "Quantidade em Estoque (int): "));
        } catch (EstoqueInvalidoException e) {
            e.impMsgErroEstoque();
            p = (Processador) e.corrigeEstoque(p, l);
        } catch (EstoqueExcedidoException e) {
            e.impMsgErroLimite();
            p = (Processador) e.corrigeLimite(p, l);
        }

        try {
            p.setPreco(TratamentoDeEntrada.lerDoubleSeguro(l, "Preço do Processador (Deve ser maior que zero): R$"));
        } catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
            p = (Processador) e.corrigePreco(p, l);
        }
        boolean querDesconto = TratamentoDeEntrada.lerSimOuNao(l, "Deseja aplicar o desconto promocional de 5% exclusivo para Processadores? (S/N): ");
        if (querDesconto) {
            p.aplicarDesconto();
            System.out.println("[PROMOÇÃO] Desconto aplicado! O novo preço é: R$ " + p.getPreco());
        }

        while (true) {
            try {
                p.getFabricante().setMarca(l.entDados("Marca do Fabricante (String): ")); //REFLEXIVIDADE
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        p.getFabricante().setCnpj(l.entDados("CNPJ do Fabricante (Ex:AA.AAA.AAA/AAAA-DD)(Opcional) (String): "));//REFLEXIVIDADE

        while (true) {
            try {
                p.setQtdNucleos(TratamentoDeEntrada.lerInteiroSeguro(l, "Número de Núcleos (int): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        while (true) {
            try {
                p.setFrequencia(TratamentoDeEntrada.lerDoubleSeguro(l, "Frequência GHz (double): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        p.setId(contadorId++);
        listaEstoque.add(p);
        System.out.println("[SUCESSO] Processador cadastrado!");
    }

    // ==========================================
    // SOBRECARGA 2: Cadastro de Placa de Vídeo
    // ==========================================

    //SOBRECARGA
    public static void cadastrar(PlacaDeVideo pv, Leitura l) {
        System.out.println("\n--- NOVA PLACA DE VÍDEO ---");

        while (true) {
            try {
                pv.setNome(l.entDados("Nome da Placa de Vídeo (String): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        try {
            pv.setQtdEstoque(TratamentoDeEntrada.lerInteiroSeguro(l,"Quantidade em Estoque (int): "));
        } catch (EstoqueInvalidoException e) {
            e.impMsgErroEstoque();
            pv = (PlacaDeVideo) e.corrigeEstoque(pv, l);
        } catch (EstoqueExcedidoException e) {
            e.impMsgErroLimite();
            pv =  (PlacaDeVideo) e.corrigeLimite(pv, l);
        }

        try {
            pv.setPreco(TratamentoDeEntrada.lerDoubleSeguro(l, "Preço da Placa de Vídeo (Deve ser maior que zero): R$ "));
        } catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
            pv = (PlacaDeVideo) e.corrigePreco(pv, l);
        }

        boolean querDesconto = TratamentoDeEntrada.lerSimOuNao(l, "Deseja aplicar o desconto promocional de 10% exclusivo para Placas de Vídeo? (S/N):");
        if (querDesconto) {
            pv.aplicarDesconto();
            System.out.println("[PROMOÇÃO] Desconto aplicado! O novo preço é: R$ " + pv.getPreco());
        }

        while (true) {
            try {
                pv.getFabricante().setMarca(l.entDados("Marca do Fabricante (String): ")); //REFLEXIVIDADE
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        pv.getFabricante().setCnpj(l.entDados("CNPJ do Fabricante (Opcional) (String): "));//REFLEXIVIDADE

        while (true) {
            try {
                pv.setVeramGb(TratamentoDeEntrada.lerInteiroSeguro(l, "Quantidade de VRAM (int GB): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        while (true) {
            try {
                pv.setConsumoWatts(TratamentoDeEntrada.lerDoubleSeguro(l, "Consumo Energético (double Watts): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        pv.setId(contadorId++);
        listaEstoque.add(pv);
        System.out.println("[SUCESSO] Placa de Vídeo cadastrada!");
    }

    // ==========================================
    // SOBRECARGA 3: Cadastro de Memória RAM
    // ==========================================

    //SOBRECARGA
    public static void cadastrar(MemoriaRam ram, Leitura l) {
        System.out.println("\n--- NOVA MEMÓRIA RAM ---");
        while (true) {
            try {
                ram.setNome(l.entDados("Nome da Memória RAM (String): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        try {
            ram.setQtdEstoque(TratamentoDeEntrada.lerInteiroSeguro(l, "Quantidade em Estoque (int): "));
        } catch (EstoqueInvalidoException e) {
            e.impMsgErroEstoque();
            ram = (MemoriaRam) e.corrigeEstoque(ram, l);
        } catch (EstoqueExcedidoException e) {
            e.impMsgErroLimite();
            ram =  (MemoriaRam) e.corrigeLimite(ram, l);
        }

        try {
            ram.setPreco(TratamentoDeEntrada.lerDoubleSeguro(l, "Preço da Memória Ram (Deve ser maior que zero): R$"));
        } catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
            ram = (MemoriaRam) e.corrigePreco(ram, l);

        }

        boolean querDesconto = TratamentoDeEntrada.lerSimOuNao(l, "Deseja aplicar o desconto promocional de 7% exclusivo para Memórias RAM? (S/N): ");
        if (querDesconto) {
            ram.aplicarDesconto();
            System.out.println("[PROMOÇÃO] Desconto aplicado! O novo preço é: R$ " + ram.getPreco());
        }


        while (true) {
            try {
                ram.getFabricante().setMarca(l.entDados("Marca do Fabricante (String): ")); //REFLEXIVIDADE
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        ram.getFabricante().setCnpj(l.entDados("CNPJ do Fabricante (Opcional) (String): "));//REFLEXIVIDADE

        while (true) {
            try {
                ram.setCapacidade(TratamentoDeEntrada.lerInteiroSeguro(l,"Capacidade (int GB): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        while (true) {
            try {
                ram.setTecMemoria(l.entDados("Tecnologia da Memória (String ex: DDR4/DDR5): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        ram.setId(contadorId++);
        listaEstoque.add(ram);
        System.out.println("[SUCESSO] Memória RAM cadastrada!");
    }


    // ==========================================
    // SOBRECARGA 4: Cadastro de Placa-Mãe
    // ==========================================

    //SOBRECARGA
    public static void cadastrar(PlacaMae pm, Leitura l) {
        System.out.println("\n--- NOVA PLACA-MÃE ---");
        while (true) {
            try {
                pm.setNome(l.entDados("Nome da Placa-Mãe (String): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        try {
            pm.setQtdEstoque(TratamentoDeEntrada.lerInteiroSeguro(l, "Quantidade em Estoque (int): "));
        } catch (EstoqueInvalidoException e) {
            e.impMsgErroEstoque();
            pm = (PlacaMae) e.corrigeEstoque(pm, l);
        } catch (EstoqueExcedidoException e) {
            e.impMsgErroLimite();
            pm = (PlacaMae) e.corrigeLimite(pm, l);
        }

        try {
            pm.setPreco(TratamentoDeEntrada.lerDoubleSeguro(l, "Preço da Placa-Mãe (Deve ser maior que zero): R$"));
        } catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
            pm = (PlacaMae) e.corrigePreco(pm, l);
        }

        boolean querDesconto = TratamentoDeEntrada.lerSimOuNao(l, "Deseja aplicar o desconto promocional de 2% exclusivo para Placas-Mãe? (S/N): ");
        if (querDesconto) {
            pm.aplicarDesconto();
            System.out.println("[PROMOÇÃO] Desconto aplicado! O novo preço é: R$ " + pm.getPreco());
        }

        while (true) {
            try {
                pm.getFabricante().setMarca(l.entDados("Marca do Fabricante (String): ")); //REFLEXIVIDADE
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        pm.getFabricante().setCnpj(l.entDados("CNPJ do Fabricante (Opcional) (String): ")); //REFLEXIVIDADE

        while (true) {
            try {
                pm.setSocket(l.entDados("Socket (String ex: AM4, LGA1700): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }
        while (true) {
            try {
                pm.setDimensao(l.entDados("Dimensão (String ex: ATX, Micro-ATX): "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
        }

        pm.setId(contadorId++);
        listaEstoque.add(pm);
        System.out.println("[SUCESSO] Placa-Mãe cadastrada!");
    }

    // ==========================================
    // RELATÓRIO DE ESTOQUE GERAL
    // ==========================================
    public static void exibirRelatorio() {
        System.out.println("\n--- RELATÓRIO GERAL DE ESTOQUE ---");

        if(listaEstoque.isEmpty()) {
            System.out.println("O estoque está vazio no momento.");
        } else {
            for(Hardware item : listaEstoque) {
                System.out.println("\n---------------------------------");
                System.out.println("ID do Produto: " + String.format("%02d", item.getId()));
                System.out.println("Componente: " + item.getNome());
                System.out.println("Preço: R$ " + item.getPreco());
                System.out.println("Estoque: " + item.getQtdEstoque() + " unidades");
                System.out.println("Fabricante: " + item.getFabricante().getMarca() + " (CNPJ: " + item.getFabricante().getCnpj() + ")");//REFLEXIVIDADE

                if (item instanceof Processador) {
                    Processador proc = (Processador) item;
                    System.out.println("TIPO: " + proc.getTipoComponente());
                    System.out.println("Núcleos: " + proc.getQtdNucleos());
                    System.out.println("Frequência: " + proc.getFrequencia() + " GHz");
                }
                else if (item instanceof PlacaDeVideo) {
                    PlacaDeVideo gpu = (PlacaDeVideo) item;
                    System.out.println("TIPO: " + gpu.getTipoComponente());
                    System.out.println("VRAM: " + gpu.getVeramGb() + " GB");
                    System.out.println("Consumo: " + gpu.getConsumoWatts() + " W");
                }
                else if (item instanceof MemoriaRam) {
                    MemoriaRam ram = (MemoriaRam) item;
                    System.out.println("TIPO: " + ram.getTipoComponente());
                    System.out.println("Capacidade: " + ram.getCapacidade() + " GB");
                    System.out.println("Tecnologia: " + ram.getTecMemoria());
                }
                else if (item instanceof PlacaMae) {
                    PlacaMae pm = (PlacaMae) item;
                    System.out.println("TIPO: " + pm.getTipoComponente());
                    System.out.println("Socket: " + pm.getSocket());
                    System.out.println("Dimensão: " + pm.getDimensao());
                }
            }
        }
    }

    // ==========================================
    // MÉTODOS AUXILIARES PARA O CAIXA (NOVO)
    // ==========================================

    // Permite que a tela de vendas busque uma peça pelo ID
    public static Hardware buscarProduto(int id) {
        for (Hardware item : listaEstoque) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null; // Retorna vazio se o ID não existir
    }

    // Permite que o sistema de vendas remova a peça se o estoque zerar
    public static List<Hardware> getListaEstoque() {
        return listaEstoque;
    }
}
