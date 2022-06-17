public class Item implements Prototipo {
    private String nome;
    private float preco;

    public Item(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Item clonar() {
        return new Item(this.nome, this.preco);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item: " + this.nome + ", Preço: R$" + String.format("%.2f", this.preco);
    }
}
