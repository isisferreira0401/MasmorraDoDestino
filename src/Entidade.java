public abstract class Entidade implements ICombativel {
    protected String nome;
    protected int hpMax, hpAtual, ataqueBase;

    public Entidade(String nome, int hpMax, int ataqueBase) {
        this.nome = nome;
        this.hpMax = hpMax;
        this.hpAtual = hpMax;
        this.ataqueBase = ataqueBase;
    }

    @Override
    public boolean estaVivo() {
        return hpAtual > 0;
    }

    @Override
    public void receberDano(int dano) {
        hpAtual = Math.max(0, hpAtual - dano);
        IO.println(String.format("-> %s recebeu %d de dano! (HP: %d/%d)", nome, dano, hpAtual, hpMax));
    }

    public String getNome() { return nome; }
    public int getHpAtual() { return hpAtual; }
    public int getHpMax() { return hpMax; }
}
