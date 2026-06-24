//Aluno: Otávio Felício RA: 2768488

public class EstoqueExcedidoException extends Exception {
    public void impMsgErroLimite() {
        System.out.println("\n[ERRO] Operação cancelada: Limite físico do galpão atingido! Máximo de 10 unidades.");
    }
    public Hardware corrigeLimite(Hardware h, Leitura l) {
        try {
            int novaQtd = TratamentoDeEntrada.lerInteiroSeguro(l, "[CORREÇÃO] Digite uma NOVA quantidade válida (Máximo de 10): ");

            h.setQtdEstoque(novaQtd);
        }
        catch (EstoqueExcedidoException e) {
            e.impMsgErroLimite();
            h = e.corrigeLimite(h, l);
        }
        catch (EstoqueInvalidoException e) {

            e.impMsgErroEstoque();
            h = e.corrigeEstoque(h, l);
        }

        return h;
    }
}