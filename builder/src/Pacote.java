public class Pacote {
    private String nome;
    private int count, no_itens;
    private float preco_total;
    private Item[] itens;

    public Pacote(String nome, int no_itens) {
        this.nome = nome;
        this.count = 0;
        this.no_itens = no_itens;
        this.preco_total = 0f;
        this.itens = new Item[no_itens];
    }

    public void adicionarItem(Item item) {
        if (this.count < this.no_itens) {
            this.itens[this.count] = item;
            this.count++;
        } else {
            System.out.println("Máximo de itens no pacote atingido!");
        }
    }

    public float getPreco() {
        for (Item item : itens) {
            this.preco_total += item.getPreco();
        }

        return this.preco_total;
    }

    public void imprimirPacote() {
        System.out.println("----------------------------");
        System.out.println("Pacote: " + this.nome);
        for (Item item : itens) {
            System.out.println(item.toString());
        }
        System.out.println("Preço total: R$" + String.format("%.2f" ,this.getPreco()));
        System.out.println("----------------------------");
    }
}
