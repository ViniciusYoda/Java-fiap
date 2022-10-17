package singleton;

public class SingleTon2 {
    private static SingleTon2 instancia = new SingleTon2();

    private SingleTon2(){

    }

    public static SingleTon2 getInstancia(){
        return instancia;
    }
}
