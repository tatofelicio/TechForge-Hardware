public class Cliente extends Pessoa {
    private String enderecoEntrega;
    private String telefone;

    // Construtor Default
    public Cliente() {
        enderecoEntrega = "";
        telefone = "";
    }

    // Construtor Sobrecarregado
    public Cliente(String enderecoEntrega, String telefone) {
        this.enderecoEntrega = enderecoEntrega;
        this.telefone = telefone;
    }

    // Getters
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public String getTelefone() { return telefone; }

    // Setters

    public void setEnderecoEntrega(String enderecoEntrega) {
        if (enderecoEntrega == null || enderecoEntrega.trim().isEmpty()) {
            this.enderecoEntrega = "Retirada na Loja"; // Valor padrão caso não preencha
        } else {
            this.enderecoEntrega = enderecoEntrega;
        }
    }
    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("O telefone é obrigatório.");
        }
        this.telefone = telefone;
    }
}