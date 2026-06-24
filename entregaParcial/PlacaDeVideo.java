//Aluno: Otávio Felício RA: 2768488

public class PlacaDeVideo extends Hardware {
    private int veramGb;
    private double consumoWatts;

    //construtor default
    public PlacaDeVideo() {
        veramGb = 0;
        consumoWatts = 0.0;
    }

    //construtor sobrecarregado com parametros
    public PlacaDeVideo(int veramGb, double consumoWatts) {
        this.veramGb = veramGb;
        this.consumoWatts = consumoWatts;
    }

    //SOBRESCRITA
    @Override
    public void aplicarDesconto() {
        try {
            // Placas de Vídeo terão 10% de desconto
            this.setPreco(this.getPreco() * 0.90);
        } catch (PrecoInvalidoException e) {
            e.impMsgErroPreco();
        }
    }

    //SOBRESCRITA
    @Override
    public String getTipoComponente() {
        return "Placa de Video";
    }

    // getters
    public int getVeramGb() {
        return veramGb;
    }

    public double getConsumoWatts() {
        return consumoWatts;
    }

    // setters
    public void setVeramGb(int vramGb) {
        if (vramGb <= 0) {
            throw new IllegalArgumentException("A VRAM da Placa de Vídeo deve ser maior que zero.");
        }
        this.veramGb = vramGb;
    }

    public void setConsumoWatts(double consumoWatts) {
        if (consumoWatts <= 0.0) {
            throw new IllegalArgumentException("O consumo energético deve ser maior que zero Watts.");
        }
        this.consumoWatts = consumoWatts;
    }
}