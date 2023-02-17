public class ex3 {
   public static void main(String[] args) {
      int a = 1;
      int b = 0;
      int fib;
      for(int i = 0; i < 100; i++) {
         System.out.println(a);
         fib = a;
         a = a + b;
         b = fib;
      }
   }
}
