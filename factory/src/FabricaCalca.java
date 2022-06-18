public class FabricaCalca extends FabricaRoupa {
    @Override
    public Calca fabricarRoupa(String nome, float preco) {
        return new Calca(nome, preco);
    }
}
