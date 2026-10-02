import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private List<Casa> casas = new ArrayList<>();

    public Tabuleiro() {
        casas.add(new CasaNormal());
        casas.add(new CasaArmadilha(15));
        casas.add(new CasaTesouro(new Item("Poção de Vida (+30 HP)", 30)));
        casas.add(new CasaMonstro(new Monstro("Centauro", 40, 10)));
        casas.add(new CasaNormal());
        casas.add(new CasaArmadilha(20));
        casas.add(new CasaMonstro(new Monstro("DRAGÃO CHEFE", 90, 20)));
    }

    public Casa getCasa(int posicao) {
        return casas.get(Math.min(posicao, casas.size() - 1));
    }

    public int getTamanho() {
        return casas.size();
    }
}
