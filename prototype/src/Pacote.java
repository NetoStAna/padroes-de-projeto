public class Pacote implements Prototipo {
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
            System.out.println("Número máximo de itens no pacote atingido!");
        }
    }

    public float getPrecoTotal() {
        for (int i = 0; i < this.count; i++) {
            this.preco_total += this.itens[i].getPreco();
        }

        return this.preco_total;
    }

    public void setItem(Item item, int index) {
        this.itens[index] = item;
    }

    public Pacote clonar() {
        Pacote novoPacote = new Pacote(this.nome, this.no_itens);

        for (int i = 0; i < this.count; i++) {
            Item item = this.itens[i].clonar();
            novoPacote.adicionarItem(item);
        }

        return novoPacote;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirPacote() {
        System.out.println("----------------------------");
        System.out.println("Pacote: " + this.nome);
        for (Item item : itens) {
            System.out.println(item.toString());
        }
        System.out.println("Preço total: R$" + String.format("%.2f" ,this.getPrecoTotal()));
        System.out.println("----------------------------");
    }
}
