package questionsJava;

public class Questions31 {

    // Write a java program to display factors of a number
    public static void main(String[] args) {

        // 10--> 1,2,5,10
        int num = 60;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
