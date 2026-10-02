public class Mago extends Heroi {
    private int mana = 30;

    public Mago(String nome) {
        super(nome, 80, 22);
    }

    @Override
    public void atacar(ICombativel alvo) {
        if (mana >= 10) {
            IO.println(" " + getNome() + " lança Bola de Fogo!");
            mana -= 10;
            alvo.receberDano(ataqueBase + 10);
        } else {
            IO.println(" " + getNome() + " ataca com o cajado!");
            alvo.receberDano(ataqueBase / 2);
        }
    }
}
