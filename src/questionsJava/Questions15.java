package questionsJava;

public class Questions15 {

    // Write a Java Program to find out Factorial of a number
    // !5= 1*2*3*4*5 =120

    public static void main(String[] args) {

        int num = 5;
        getFactorial(num);

    }
    public static void getFactorial(int num){
        int fact = 1;

        for ( int i = 1; i <= 5; i++){
            fact = fact * i;

        }
        System.out.println("The Factorial of "+num+" is "+fact);

    }
}
