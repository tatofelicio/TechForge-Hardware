//Aluno: Otávio Felício RA: 2768488

public class PrecoInvalidoException extends Exception {
    public void impMsgErroPreco(){
        System.out.println("\n[ERRO] Operação cancelada: O preço do componente não pode ser negativo ou zero!");
    }
    // Metodo que captura o erro e pede a digitação novamente
    public Hardware corrigePreco(Hardware h, Leitura l){
        try {
            //usando o replace da vírgula para ponto!
            h.setPreco(Double.parseDouble(l.entDados("[CORREÇÃO] Digite um NOVO preço válido (double): ").replace(",", ".")));
        }
        catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
            h = e.corrigePreco(h, l);
        }
        catch (NumberFormatException nfe) {
            System.out.println("\n[ERRO] Você precisa digitar um número válido para o preço!");
            h = this.corrigePreco(h, l);
        }

        return h;
    }
}