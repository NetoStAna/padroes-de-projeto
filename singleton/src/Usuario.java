public class Usuario {
    private String nome;
    private int id, idade;

    public Usuario(String nome, int idade) {
        this.id = 2545;
        this.nome = nome;
        this.idade = idade;
    }

    public void configurar(Aplicacao aplicacao, String tema, String idioma, float escala, boolean contraste) {
        aplicacao.setTema(tema);
        aplicacao.setIdioma(idioma);
        aplicacao.setEscala_de_visualizacao(escala);
        aplicacao.setAlto_contraste(contraste);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "-----------------------\n" +
               "Usuário Id: " + this.id + "\n" +
               "\tNome: " + this.nome + "\n" +
               "\tIdade: " + this.idade + "\n" +
               "-----------------------";
    }
}
