public class PlacaMae extends Hardware {
    private String socket;
    private String dimensao; // Substituiu o chipset

    // Construtor Default
    public PlacaMae() {
        this.socket = "";
        this.dimensao = "";
    }

    //CONSTRUTOR SOBRECARREGADO
    public PlacaMae(String socket, String dimensao) {
        this.socket = socket;
        this.dimensao = dimensao;
    }

    //SOBRESCRITA
    @Override
    public String getTipoComponente() {
        return "Placa Mãe";
    }

    //SOBRESCRITA
    @Override
    public void aplicarDesconto() {
        try {
            this.setPreco(this.getPreco() * 0.98);
        } catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
        }
    }

    // Getters
    public String getSocket() { return socket; }
    public String getDimensao() { return dimensao; }

    // Setters com validações
    public void setSocket(String socket) {
        if (socket == null || socket.trim().isEmpty()) {
            throw new IllegalArgumentException("O socket da placa-mãe é obrigatório.");
        }
        this.socket = socket;
    }

    public void setDimensao(String dimensao) {
        if (dimensao == null || dimensao.trim().isEmpty()) {
            throw new IllegalArgumentException("A dimensão (Form Factor) é obrigatória.");
        }
        this.dimensao = dimensao;
    }
}
