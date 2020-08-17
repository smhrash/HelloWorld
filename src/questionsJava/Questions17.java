package questionsJava;

public class Questions17 {

    // Write a Java to create a Fibonacii series
    // 0 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {

        int num = 20;
        int t1 = 0;
        int t2 = 1;
        for (int i = 0; i <=num; i++){
            int sum = t1+t2;
            t1=t2;
            t2= sum;
            System.out.print(sum+" ");

        }

    }
}
