public class PacotePremium implements Construtor {
    private Pacote pacotePremium;

    @Override
    public void construir() {
        this.pacotePremium = new Pacote("Premium", 5);

        this.pacotePremium.adicionarItem(new Item("Camisa Linho Premium", 79.9f));
        this.pacotePremium.adicionarItem(new Item("Camisa Algodão Premium", 59.9f));
        this.pacotePremium.adicionarItem(new Item("Calça Jeans Premium", 149.9f));
        this.pacotePremium.adicionarItem(new Item("Cinto de Couro Premium", 99.9f));
        this.pacotePremium.adicionarItem(new Item("Sapato de Couro Premium", 179.9f));
        
    }

    @Override
    public Pacote getPacote() {
        return this.pacotePremium;
    }
}
