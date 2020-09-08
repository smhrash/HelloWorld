package questionsJava;

import java.util.Scanner;

public class Questions32 {

    // Write a Java to make a Calculator using switch case
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your two numbers: ");

        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();

        System.out.println("Please enter an operator (+,-,*,/): ");
        char operator = input.next().charAt(0);
        double result = 0;

        switch (operator){
            case '+': result=firstNum + secondNum;
            break;
            case '-': result=firstNum - secondNum;
            break;
            case '*': result=firstNum * secondNum;
            break;
            case '/': result=firstNum / secondNum;
            break;
            default:
                System.out.println("Please enter a right operator");

                break;
        }
        System.out.println("Result: "+result);


    }
}
