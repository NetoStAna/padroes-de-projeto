public class Sapato implements Roupa {
    private String nome;
    private float preco;
    
    public Sapato(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void experimentar(String cliente) {
        System.out.println("Cliente: " + cliente + ", calçou o sapato " + this.nome +
                           ", com preço R$" + String.format("%.2f", this.preco));
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
