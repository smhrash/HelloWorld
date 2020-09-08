package questionsJava;

public class Questions23 {

   // Write a Java program to calculate power of number
   public static void main(String[] args) {

       // 4^2 =16; or 4^3=64
       int base = 4;
       int exponent = 3;
       long result = 1;

       while (exponent != 0){
           result *= base;
           -- exponent;
       }
       System.out.println(result);
      // System.out.println(Math.pow(base,exponent));
   }
}
