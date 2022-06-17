public class App {
    public static void main(String[] args) throws Exception {
        Pacote pacotePrototipo = new Pacote("", 2);

        Pacote pacotePadrao = pacotePrototipo.clonar();
        pacotePadrao.setNome("Padrão");
        pacotePadrao.adicionarItem(new Item("Camisa Padrão", 24.5f));
        pacotePadrao.adicionarItem(new Item("Cinto de Couro", 69.9f));

        Pacote pacotePremium = pacotePadrao.clonar();
        pacotePremium.setNome("Premium");
        pacotePremium.setItem(new Item("Camisa Premium", 59.9f), 0);

        pacotePadrao.imprimirPacote();
        pacotePremium.imprimirPacote();
    }
}
