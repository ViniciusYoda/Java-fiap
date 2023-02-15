public class ex4 {

   public static void main(String[] args) {

      //2x^2 + 3x + 4 = 0
      int a = 2;
      int b = 3;
      int c = 4.

      int delta = (b * b) - 4 * a * c;

      if(delta < 0) {
         System.out.println("Não existem raizes iguais");
      } else if (delta == 0) {
         System.out.println("Existem duas raizes iguais.");
         double x1 = ((b * (-1)) + (Math.sqrt(delta))) / (2 * a);
         double x2 = x1;
         System.out.println("delta + " + delta);
         System.out.println("x1: " + x1);
         System.out.println("x2: " + x2);
      } else {
         System.out.println("Existem duas raizes.");
         double x1 = ((b * (-1)) + (Math.sqrt(delta))) / (2 * a);
         double x2 = ((b * (-1)) - (Math.sqrt(delta))) / (2 * a);
         System.out.println("delta + " + delta);
         System.out.println("x1: " + x1);
         System.out.println("x2: " + x2);
      }
   }
}
