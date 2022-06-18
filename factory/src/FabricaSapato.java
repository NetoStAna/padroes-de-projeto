public class FabricaSapato extends FabricaRoupa {
    @Override
    public Sapato fabricarRoupa(String nome, float preco) {
        return new Sapato(nome, preco);
    }
}
