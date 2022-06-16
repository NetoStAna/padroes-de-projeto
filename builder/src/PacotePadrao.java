public class PacotePadrao implements Construtor {
    private Pacote pacotePadrao;

    @Override
    public void construir() {
        this.pacotePadrao = new Pacote("Padrão", 5);
        
        this.pacotePadrao.adicionarItem(new Item("Camisa Branca Padrão", 24.5f));
        this.pacotePadrao.adicionarItem(new Item("Camisa Preta Padrão", 24.5f));
        this.pacotePadrao.adicionarItem(new Item("Calça Jeans Padrão", 69.9f));
        this.pacotePadrao.adicionarItem(new Item("Cinto Padrão", 49.9f));
        this.pacotePadrao.adicionarItem(new Item("Sapatênis Padrão", 109.9f));

    }

    @Override
    public Pacote getPacote() {
        return this.pacotePadrao;
    }
}
