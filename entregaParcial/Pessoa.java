public abstract class Pessoa {
    private String nome;
    private String cpf;

    // Construtor Default
    public Pessoa() {
        nome = "";
        cpf = "";
    }

    // Construtor sobrecarregado com parâmetros
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ficar em branco.");
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("O CPF é obrigatório.");
        }
        this.cpf = cpf;
    }
}
