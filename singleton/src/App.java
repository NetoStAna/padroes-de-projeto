public class App {
    public static void main(String[] args) throws Exception {
        Aplicacao estadoInicial = Aplicacao.getInstancia();
        System.out.println(estadoInicial.toString());

        Usuario usuario1 = new Usuario("Fulano", 30);
        System.out.println(usuario1.toString());

        Aplicacao usuario1Config = Aplicacao.getInstancia();
        usuario1.configurar(usuario1Config, "dark", "português", .75f, false);
        System.out.println(usuario1Config.toString());

        Usuario usuario2 = new Usuario("Fulano", 30);
        System.out.println(usuario2.toString());

        Aplicacao usuario2Config = Aplicacao.getInstancia();
        usuario2.configurar(usuario2Config, "dark", "português", 1.5f, true);
        System.out.println(usuario2Config.toString());

        if (usuario1 == usuario2) {
            System.out.println("Usuário 1 e 2 são o mesmo objeto");
        } else {
            System.out.println("Usuário 1 e 2 são objetos diferentes");
        }

        if (estadoInicial == usuario1Config && estadoInicial == usuario2Config && usuario1Config == usuario2Config) {
            System.out.println("Todas as instâncias da aplicação são o mesmo objeto");
        } else {
            System.out.println("Aplicação gerou várias instâncias de si mesma");
        }
    }
}
