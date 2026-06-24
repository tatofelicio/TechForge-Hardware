//Aluno: Otávio Felício RA: 2768488

public class Fabricante {
    private String marca;
    private String cnpj;

//construtor default
    public Fabricante(){
        marca = "";
        cnpj = "";
    }

//construtor sobrecarregado com parâmetros
    public Fabricante(String marca, String cnpj){
        this.marca = marca;
        this.cnpj = cnpj;
    }

//getters
    public String getMarca() {
        return marca;
    }

    public String getCnpj() {
        return cnpj;
    }

    //setters
    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca do fabricante é obrigatória.");
        }
        this.marca = marca;
    }
    public void setCnpj(String cnpj) {
        if (cnpj == null || cnpj.trim().isEmpty()) {
            this.cnpj = "Não informado";
        } else {
            this.cnpj = cnpj;
        }
    }
}