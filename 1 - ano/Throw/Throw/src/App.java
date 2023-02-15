import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		int nota1, nota2,res;

        nota1 = 60;
        nota2 = 20;

        if(nota1 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        if(nota2 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        res = nota1+nota2
        System.out.println('Resultado' + res);
        

		try{
			System.out.println(carros.get(10);
		}catch(IndexOutOfBoundsException e){
			System.out.println('Erro: Valor fora do indice do array');
		}finally{
			System.out.println('Fim do Try')
		}
		
	}
}

