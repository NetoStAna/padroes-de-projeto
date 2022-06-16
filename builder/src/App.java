public class App {
    public static void main(String[] args) throws Exception {
        Diretor pacote;

        pacote = new Diretor(new PacotePadrao());
        Pacote pacotePadrao = pacote.construirPacote();
        pacotePadrao.imprimirPacote();

        pacote = new Diretor(new PacotePremium());
        Pacote pacotePremium = pacote.construirPacote();
        pacotePremium.imprimirPacote();

        Pacote pacoteCustom = new Pacote("Custom", 3);
        pacoteCustom.adicionarItem(new Item("Camisa Algodão Premium", 59.9f));
        pacoteCustom.adicionarItem(new Item("Calça Jeans Padrão", 69.9f));
        pacoteCustom.adicionarItem(new Item("Sapatênis Padrão", 109.9f));
        pacoteCustom.imprimirPacote();
    }
}
