public class ExemploInterface {
    public static void main(String[] args) {
        ModeloTV001 tv1 = new ModeloTV001(50);
        ModeloX tv2 = new ModeloX(70);

        System.out.println("Status tv1: " + tv1.isLigado());
        tv1.ligar();
        System.out.println("Status tv1: " + tv1.isLigado());
        System.out.println("Status tv2: " + tv2.isLigado());
        tv2.ligar();
        System.out.println("Status tv2: " + (tv2.isLigado()?"LIGADA":"Desligada"));

        System.out.println("Desligando a TV..." + tv1.MODELO);
        tv1.desligar();
        System.out.println("Desligando a TV..." + tv2.MODELO);
        tv2.desligar();
    }
}
