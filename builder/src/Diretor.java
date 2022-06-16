public class Diretor {
    private Construtor construtor;

    public Diretor(Construtor construtor) {
        this.construtor = construtor;
    }

    public Pacote construirPacote() {
        this.construtor.construir();
        
        return this.construtor.getPacote();
    }
}
