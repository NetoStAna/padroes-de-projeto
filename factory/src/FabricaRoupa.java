public abstract class FabricaRoupa {
    public abstract Roupa fabricarRoupa(String nome, float preco);

    public void experimentar(String cliente, String nome, float preco) {
        Roupa roupa = this.fabricarRoupa(nome, preco);
        roupa.experimentar(cliente);
    }
}
