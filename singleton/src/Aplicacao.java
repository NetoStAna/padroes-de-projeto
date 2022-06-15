public final class Aplicacao {
    private static Aplicacao instancia = null;
    private int id;
    private String tema, idioma;
    private float escala_de_visualizacao;
    private boolean alto_contraste;

    private Aplicacao() {
        this.id = 5646;
        this.tema = "light";
        this.idioma = "english";
        this.escala_de_visualizacao = 1.0f;
        this.alto_contraste = false;
    }

    public static Aplicacao getInstancia() {
        if (Aplicacao.instancia == null) {
            synchronized(Aplicacao.class) {
                if (Aplicacao.instancia == null) {
                    Aplicacao.instancia = new Aplicacao();
                }
            }
        }

        return Aplicacao.instancia;
    }

    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public float getEscala_de_visualizacao() {
        return escala_de_visualizacao;
    }
    public void setEscala_de_visualizacao(float escala_de_visualizacao) {
        this.escala_de_visualizacao = escala_de_visualizacao;
    }

    public boolean isAlto_contraste() {
        return alto_contraste;
    }
    public void setAlto_contraste(boolean alto_contraste) {
        this.alto_contraste = alto_contraste;
    }

    @Override
    public String toString() {
        return "---------------------------\n" +
               "Configurações da aplicação:\n" +
               "\tId: " + this.id + "\n" +
               "\tTema: " + this.tema + "\n" +
               "\tIdioma: " + this.idioma + "\n" +
               "\tEscala de Visualização: " + (int) (this.escala_de_visualizacao*100) + "%\n" +
               "\tAlto contraste: " + this.alto_contraste + "\n" +
               "---------------------------";
    }
}
