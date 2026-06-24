//Aluno: Otávio Felício RA: 2768488

public class EstoqueInvalidoException extends Exception {
    public void impMsgErroEstoque(){
        System.out.println("\n[ERRO] Operação cancelada: A quantidade em estoque não pode ser menor que zero!");
    }
    // Metodo que captura o erro e pede a digitação novamente
    public Hardware corrigeEstoque(Hardware h, Leitura l) {
        try {
            h.setQtdEstoque(Integer.parseInt(l.entDados("[CORREÇÃO] Digite uma NOVA quantidade válida (int): ")));
        }
        catch (EstoqueInvalidoException e) {
            e.impMsgErroEstoque();
            h = e.corrigeEstoque(h, l);
        }
        catch (EstoqueExcedidoException eee) {
            System.out.println("\n[ERRO] O limite do galpão (10) foi atingido durante a correção.");
        }
        catch (NumberFormatException nfe) {
            System.out.println("\n[ERRO] Você precisa digitar um número inteiro válido!");
            h = this.corrigeEstoque(h, l);
        }

        return h;
    }
}
