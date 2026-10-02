public abstract class Casa {
    private String descricao;

    public Casa(String descricao) {
        this.descricao = descricao;
    }

    public abstract void executarAcao(Heroi heroi);
    public String getDescricao() { return descricao; }

    protected void pausar() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException ignored) {}
    }
}
