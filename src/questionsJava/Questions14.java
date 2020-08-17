package questionsJava;

public class Questions14 {

    // Write a Java Program to calculate sum of Natural numbers

    // 1+2+3+4+..........+100=>5050
    public static void main(String[] args) {

        int num= 100;
        int sum = 0;

        for (int i = 1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println(sum);


    }
}
