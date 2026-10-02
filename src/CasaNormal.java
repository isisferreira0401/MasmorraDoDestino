public class CasaNormal extends Casa {
    public CasaNormal() {
        super("Sala vazia e tranquila.");
    }

    @Override
    public void executarAcao(Heroi heroi) {
        IO.println(" Nenhum perigo à vista.");
    }
}