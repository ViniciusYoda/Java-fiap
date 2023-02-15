package singleton;

public class SingleTon {

    private static SingleTon instancia;

    private SingleTon(){

    }

    public static SingleTon getInstancia(){
        if(instancia == null) {
            instancia = new SingleTon();
            System.out.println("Objeto criado!");
        }else{
            System.out.println("Objeto não criado!");
        }
        return instancia;
    }
}