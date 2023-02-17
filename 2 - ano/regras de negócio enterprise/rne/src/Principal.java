public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
    }
}
