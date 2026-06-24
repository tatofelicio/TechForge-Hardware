public class Vendedor extends Pessoa {
    private String matricula;

    // Construtor Default
    public Vendedor() {
        matricula = "";
    }

    //Construtor Sobrecarregado com Parâmetros
    public Vendedor(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("A matrícula do vendedor é obrigatória.");
        }
        this.matricula = matricula;
    }
}