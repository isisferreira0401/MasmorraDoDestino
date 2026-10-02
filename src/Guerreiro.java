public class Guerreiro extends Heroi {
    public Guerreiro(String nome) {
        super(nome, 120, 15);
    }

    @Override
    public void atacar(ICombativel alvo) {
        IO.println("⚔ " + getNome() + " ataca com sua espada!");
        alvo.receberDano(ataqueBase);
    }

    @Override
    public void receberDano(int dano) {
        IO.println("🛡️ Escudo absorveu 3 de dano!");
        super.receberDano(Math.max(1, dano - 3));
    }
}

