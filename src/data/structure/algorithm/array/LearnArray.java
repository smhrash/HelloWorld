package data.structure.algorithm.array;

public class LearnArray {

    static String[] names = {"Denys", "Nafis", "Sami", "Kazi", "Maoya", "Ruposri"};

    static String[] addresses = new String[6];


    public static void main(String[] args) {


        int lenghOfNames = names.length;
        System.out.println("The Number of students: " + lenghOfNames);

        for (int i = 0; i <= 5; i++) {
            System.out.print(names[i] + ", ");

        }

        System.out.println("\n==================================================");
        addresses[0] = "Woodside, New York";
        addresses[1] = "Sunny Side, New York";
        addresses[2] = "Jackson Height, New York";
        addresses[3] = "Manhattan, New York";
        addresses[4] = "Jamaica, New York";
        addresses[5] = "Brooklyn, New York";

        System.out.println(addresses.length);
        for (int i = 0; i < 6; i++) {
            System.out.println(addresses[i]);
        }

        System.out.println("=================================");
        for (String addrs : addresses) {
            System.out.println(addrs);

        }
        int[] ages = {24, 35, 40, 42, 45, 41};
        System.out.println(ages.length);

        for (int age : ages) {
            System.out.print(age + " ");

        }

    }
}
