public class CasaArmadilha extends Casa {
    private int dano;

    public CasaArmadilha(int dano) {
        super("Cuidado! Armadilha no chão");
        this.dano = dano;
    }

    @Override
    public void executarAcao(Heroi heroi) {
        IO.println(" Você ativou uma armadilha de dardos!");
        heroi.receberDano(dano);
    }
}