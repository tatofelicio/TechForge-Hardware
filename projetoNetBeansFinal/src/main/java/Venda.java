//OTÁVIO FELÍCIO 2768488

import java.util.ArrayList;
import java.util.List;

public class Venda {

    // Auto-incremento para gerar o número do Cupom Fiscal automaticamente
    private static int contadorVendas = 1;

    private int idVenda;
    private Cliente comprador;
    private Vendedor atendente;
    private List<Hardware> carrinho = new ArrayList<>();
    private double valorTotal;

    // Construtor Default
    public Venda() {
        this.idVenda = contadorVendas++;
        this.comprador = new Cliente();
        this.atendente = new Vendedor();
        this.valorTotal = 0.0;
    }

    //Construtor sobrecarregado
    public Venda(Cliente comprador, Vendedor atendente, double valorTotal, List<Hardware> carrinho) {
        this.idVenda = contadorVendas++;
        this.comprador = comprador;
        this.atendente = atendente;
        this.carrinho = carrinho;
        this.valorTotal = valorTotal;
    }

    // Getters
    public int getIdVenda() {
        return idVenda;
    }
    public Cliente getComprador() {
        return comprador;
    }
    public Vendedor getAtendente() {
        return atendente;
    }
    public List<Hardware> getCarrinho() {
        return carrinho;
    }
    public double getValorTotal() {
        return valorTotal;
    }

    // Setters para os atores
    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    public void setAtendente(Vendedor atendente) {
        this.atendente = atendente;
    }
    public void setCarrinho(List<Hardware> carrinho) {
        this.carrinho = carrinho;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }


    public void adicionarItem(Hardware item) {
        this.carrinho.add(item);
        this.valorTotal += item.getPreco();
    }
}