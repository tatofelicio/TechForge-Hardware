//Aluno: Otávio Felício RA: 2768488

public class Processador extends Hardware {
    private int qtdNucleos;
    private double frequencia;

    //construtor default
    public Processador() {
        qtdNucleos = 0;
        frequencia = 0.0;
    }

    //construtor sobrecarregado com parametros
    public Processador(int qtdNucleos, double frequencia) {
        this.qtdNucleos = qtdNucleos;
        this.frequencia = frequencia;
    }

    //SOBRESCRITA
    @Override
    public void aplicarDesconto() throws PrecoInvalidoException {
        // Agora, se o setPreco falhar, o erro sobe automaticamente para o botão que chamou
        //7%
        this.setPreco(this.getPreco() * 0.93);
    }

    //SOBRESCRITA
    @Override
    public String getTipoComponente() {
        return "Processador";
    }

    // getters
    public int getQtdNucleos() {

        return qtdNucleos;
    }

    public double getFrequencia() {
        return frequencia;
    }

    //setters
    public void setQtdNucleos(int qtdNucleos) {
        if (qtdNucleos <= 0) {
            // O próprio Java grita que esse argumento é uma ofensa à lógica!
            throw new IllegalArgumentException("Um processador deve ter pelo menos 1 núcleo.");
        }
        this.qtdNucleos = qtdNucleos;
    }

    public void setFrequencia(double frequencia) {
            if (frequencia <= 0.0) {
                throw new IllegalArgumentException("A frequência não pode ser zero ou negativa.");
            }
            this.frequencia = frequencia;
        }
}
