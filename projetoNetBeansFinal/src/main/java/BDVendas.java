//OTÁVIO FELÍCIO 2768488

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BDVendas {
    
    private Map<String,Double> comissaoPorMatricula;
    private List<Venda> bdVendas;
    
    private static BDVendas BDVendasUnic;
    
    private BDVendas(){
        bdVendas = new ArrayList<Venda>();
        comissaoPorMatricula  = new HashMap<>();
    }
    
    //METODO SIGLETON
    public static BDVendas geraBDVendas(){
    if(BDVendasUnic == null){
    BDVendasUnic = new BDVendas();
    }
    return BDVendasUnic;
    }
    

    public void inserir(Venda v) {
        bdVendas.add(v);
    }
    
    public List<Venda> consultarTodos() {
        return bdVendas;
    }
    
    public Venda consultarPorId(int idVenda) {
        for (Venda v : bdVendas) {
            if (v.getIdVenda() == idVenda) {
                return v; 
            }
        }
        return null; 
    }
    
    public boolean alterar(int idVenda, Venda vendaAtualizada) {
        for (int i = 0; i < bdVendas.size(); i++) {
            if (bdVendas.get(i).getIdVenda() == idVenda) {
                vendaAtualizada.setIdVenda(idVenda);
                bdVendas.set(i, vendaAtualizada);
                return true; 
            }
        }
        return false;
    }
    
    public boolean excluir(int idVenda) {
        Venda v = consultarPorId(idVenda);
        if (v != null) {
            bdVendas.remove(v);
            return true; 
        }
        return false;
    }

    
    public void registrarComissao(String matricula, double bonus) {
        double acumuladoAtual = comissaoPorMatricula.getOrDefault(matricula, 0.0);
        comissaoPorMatricula.put(matricula, acumuladoAtual + bonus);
    }
    
    public Map<String, Double> consultarComissoes() {
        return comissaoPorMatricula;
    }
}
