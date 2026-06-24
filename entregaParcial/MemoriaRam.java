//Aluno: Otávio Felício RA: 2768488

public class MemoriaRam extends Hardware {
    private int capacidadeGb;
    private String tecMemoria;

    //construtor default
    public MemoriaRam(){
        capacidadeGb = 0;
        tecMemoria = "";
    }

    //construtor sobrecarregado com parâmetros
    public MemoriaRam(int capacidadeGb, String tecMemoria) {
        this.capacidadeGb = capacidadeGb;
        this.tecMemoria = tecMemoria;
    }

    //SOBRESCRITA
    @Override
    public void aplicarDesconto() {
        try {
            this.setPreco(this.getPreco() * 0.93);
        } catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
        }
    }

    //SOBRESCRITA
    @Override
    public String getTipoComponente() {
        return "Memoria Ram";
    }

    // geters
    public int getCapacidade() {
        return capacidadeGb;
    }
    public String getTecMemoria() {
        return tecMemoria;
    }

    // setters
    public void setCapacidade(int capacidadeGb) {
        if (capacidadeGb <= 0) {
            throw new IllegalArgumentException("A capacidade da Memória RAM deve ser maior que zero.");
        }
        this.capacidadeGb = capacidadeGb;
    }

    public void setTecMemoria(String tecMemoria) {
        if (tecMemoria == null || tecMemoria.trim().isEmpty()) {
            throw new IllegalArgumentException("A tecnologia da memória não pode ficar em branco (Ex: DDR4).");
        }
        this.tecMemoria = tecMemoria;
    }
}
