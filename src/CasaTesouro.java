public class CasaTesouro extends Casa {
    private Item item;

    public CasaTesouro(Item item) {
        super("Um baú de tesouro escondido !");
        this.item = item;
    }

    @Override
    public void executarAcao(Heroi heroi) {
        heroi.adicionarItem(item);
    }
}