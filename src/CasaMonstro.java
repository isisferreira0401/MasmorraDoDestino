public class CasaMonstro extends Casa {
    private Monstro monstro;

    public CasaMonstro(Monstro monstro) {
        super("Um inimigo está em seu caminho");
        this.monstro = monstro;
    }

    @Override
    public void executarAcao(Heroi heroi) {
        IO.println(" COMBATE CONTRA " + monstro.getNome().toUpperCase());

        while (heroi.estaVivo() && monstro.estaVivo()) {
            pausar();
            heroi.atacar(monstro);

            if (monstro.estaVivo()) {
                pausar();
                monstro.atacar(heroi);
            }
        }

        if (heroi.estaVivo()) {
            IO.println(" Inimigo derrotado!");
        }
    }
}