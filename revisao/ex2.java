import java.util.Scanner;

public class exerc2 {
   public static void main(String[] args) {
      float peso;
      float altura;
      float imc;
      Scanner input = new Scanner(System.in);
      System.out.print("Qual seu peso? : ");
      peso = input.nextFloat();
      System.out.print("Qual sua altura? : ");
      altura = input.nextFloat();
      imc = peso / (altura * altura);
      System.out.print(imc);
      System.out.println();
      if (imc < 18.6) {
         System.out.println("Abaixo do peso");
      } else if (imc >= 18.6 || imc <= 24.9) {
         System.out.println("Peso ideal");
         } else if (imc > 24.9 || imc <= 29.9 ) {
         System.out.println("Levamento acima do peso");
      } else if (imc > 29.9 || imc <= 34.9) {
         System.out.println("Obesidade grau");
      } else if (imc > 34.9 || imc <= 39.9) {
         System.out.println("Obesida grau II");
      } else if (imc > 39.9) {
         System.out.println("Obesidade grau III");
      }
   }
}