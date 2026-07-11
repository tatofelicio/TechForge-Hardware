//OTÁVIO FELÍCIO 2768488


import java.util.List;
import java.util.ArrayList;

public class BDEstoque {

    private int contadorId = 1;
    private List<Hardware> bdEstoque;

    private static BDEstoque BDEstoqueUnic;

    private BDEstoque() {
        bdEstoque = new ArrayList<Hardware>();
    }

    //MÉTODO SINGLETON
    public static BDEstoque geraBDEstoque() {
        if (BDEstoqueUnic == null) {
            BDEstoqueUnic = new BDEstoque();
        }
        return BDEstoqueUnic;
    }

    //insere
    public void inserir(Hardware h) {
        h.setId(contadorId);
        bdEstoque.add(h);
        contadorId++;
    }

    //busca
    public List<Hardware> consultarTodos() {
        return bdEstoque;
    }

    //busca todos
    public Hardware consultarPorId(int id) {
        for (Hardware h : bdEstoque) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null; 
    }

    //modifica
    public boolean alterar(int id, Hardware hardwareAtualizado) {
        for (int i = 0; i < bdEstoque.size(); i++) {
            if (bdEstoque.get(i).getId() == id) {
                hardwareAtualizado.setId(id);
                bdEstoque.set(i, hardwareAtualizado);
                return true;
            }
        }
        return false;
    }

    //excloi
    public boolean excluir(int id) {
        Hardware h = consultarPorId(id);
        if (h != null) {
            bdEstoque.remove(h);
            return true;
        }
        return false;
    }

}
