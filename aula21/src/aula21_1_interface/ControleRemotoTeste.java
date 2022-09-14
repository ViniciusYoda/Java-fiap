package aula21_1_interface;

public class ControleRemotoTeste {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();

        cr.abrirMenu();
        cr.ligar();
        cr.abrirMenu();

        System.out.println("Volume: " + cr.getVolume());
        cr.aumentarVolume();
        System.out.println("Volume: " + cr.getVolume());

        cr.play();
        cr.ativarMudo();
        System.out.println("Volume: " + cr.getVolume());

        cr.desativarMudo();
        System.out.println("Volume: " + cr.getVolume());

        cr.abrirMenu();
        cr.fecharMenu();

        cr.desligar();
    }
}