public class App {
    public static void main(String[] args) throws Exception {
        FabricaCamisa fabricaCamisa = new FabricaCamisa();
        FabricaCalca fabricaCalca = new FabricaCalca();
        FabricaSapato fabricaSapato = new FabricaSapato();

        Camisa camisaPadrao = fabricaCamisa.fabricarRoupa("Camisa Padrão", 24.5f);
        camisaPadrao.experimentar("Carla");

        Camisa camisaPremium = fabricaCamisa.fabricarRoupa("Camisa Premium", 59.9f);
        camisaPremium.experimentar("Roberto");

        Calca calcaPadrao = fabricaCalca.fabricarRoupa("Calça Padrão", 69.9f);
        calcaPadrao.experimentar("Roberto");

        Calca calcaPremium = fabricaCalca.fabricarRoupa("Calça Premium", 149.9f);
        calcaPremium.experimentar("Carla");

        Sapato sapatoPadrao = fabricaSapato.fabricarRoupa("Sapato Padrão", 109.9f);
        sapatoPadrao.experimentar("Roberto");

        Sapato sapatoPremium = fabricaSapato.fabricarRoupa("Sapato Premium", 179.9f);
        sapatoPremium.experimentar("Carla");

        fabricaCamisa.experimentar("Roberto", "Camisa de Linho", 79.9f);
    }
}
