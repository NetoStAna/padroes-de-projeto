public class FabricaCamisa extends FabricaRoupa {
    @Override
    public Camisa fabricarRoupa(String nome, float preco) {
        return new Camisa(nome, preco);
    }
}
