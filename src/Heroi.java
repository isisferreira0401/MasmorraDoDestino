import java.util.ArrayList;
import java.util.List;

public abstract class Heroi extends Entidade {
    private int posicao = 0;
    private List<Item> inventario = new ArrayList<>();

    public Heroi(String nome, int hp, int ataque) {
        super(nome, hp, ataque);
    }

    public void mover(int passos) {
        posicao += passos;
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
        IO.println(" [INVENTÁRIO] Item obtido: " + item.getNome());
        if (item.getCura() > 0) {
            hpAtual = Math.min(hpMax, hpAtual + item.getCura());
            IO.println(String.format(" Recuperou %d de HP! (HP: %d/%d)", item.getCura(), hpAtual, hpMax));
        }
    }

    public int getPosicao() { return posicao; }
}