//Aluno: Otávio Felício RA: 2768488

public class TratamentoDeEntrada {
    public static int lerInteiroSeguro(Leitura l, String mensagem) {
        try {
            return Integer.parseInt(l.entDados(mensagem));
        } catch (NumberFormatException e) {
            System.out.println("\n[ERRO NATIVO] Formato inválido! Digite um número inteiro sem letras ou vírgulas.");
            return lerInteiroSeguro(l, mensagem);
        }
    }

    public static double lerDoubleSeguro(Leitura l, String mensagem) {
        try {
            // Já faz o replace da vírgula do padrão brasileiro para o ponto americano
            return Double.parseDouble(l.entDados(mensagem).replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("\n[ERRO NATIVO] Formato decimal inválido! Digite apenas números.");
            return lerDoubleSeguro(l, mensagem);
        }
    }
    public static boolean lerSimOuNao(Leitura l, String mensagem) {
        while (true) {
            String resposta = l.entDados(mensagem);

            if (resposta.equalsIgnoreCase("S")) {
                return true;
            } else if (resposta.equalsIgnoreCase("N")) {
                return false;
            }

            System.out.println("[ERRO DE VALIDAÇÃO] Resposta inválida! Digite apenas 'S' para Sim ou 'N' para Não.");
        }
    }
}
