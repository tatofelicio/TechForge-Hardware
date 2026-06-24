//Aluno: Otávio Felício RA: 2768488

public abstract class  Hardware implements Promocional{


    private int id;
    private String nome;
    private double preco;
    private int qtdEstoque;
    private Fabricante fabricante;

    //construtor default
    public Hardware() {
    id = 0;
    nome = "";
    preco = 0;
    qtdEstoque = 0;
    fabricante = new Fabricante();
    }

    //construtor sobrecarregado com parâmetros
    public Hardware(int id,String nome, double preco, int qtdeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdeEstoque;
        this.fabricante = new Fabricante();
    }

    //metodo abstrato que sera sobrecarregado pelas filhas
    public abstract String getTipoComponente();

    // getters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do componente não pode ficar em branco.");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco <= 0){
            throw new PrecoInvalidoException(); //valida precos negativos
        }
        this.preco = preco;
    }

    public void setQtdEstoque(int qtdEstoque) throws EstoqueInvalidoException, EstoqueExcedidoException {
        if (qtdEstoque < 0) {
            throw new EstoqueInvalidoException(); //valida números negativos
        } else if (qtdEstoque > 10) {
            throw new EstoqueExcedidoException(); //valida excesso de estoque
        }

        this.qtdEstoque = qtdEstoque;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
