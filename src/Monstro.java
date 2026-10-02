public class Monstro extends Entidade {
    public Monstro(String nome, int hp, int ataque) {
        super(nome, hp, ataque);
    }

    @Override
    public void atacar(ICombativel alvo) {
        IO.println(" " + getNome() + " contra-ataca!");
        alvo.receberDano(ataqueBase);
    }
}