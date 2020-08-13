package data.structure.algorithm.array;

public class Learn2DArray {

    static String[][] students = {{"Sl", "First Name", "Phone", "Address"},
            {"1", "Sarker Rashid", "345-333-4345", "Queens NY"},
            {"2", "Kazi Maoya", "347-383-4345", "Jamaica NY"},
            {"3", "Sami Sheikh", "345-003-4775", "Queens NY"},
    };


    public static void main(String[] args) {

        System.out.println(students.length);

        for (String[] student : students) {
            for (String std : student) {
                System.out.println(std);
            }

        }

        String[][] employees = new String[7][6];
        employees[0][0] = "Emp ID";
        employees[0][1] = "Emp Name";
        employees[0][2] = "Emp Address";
        employees[0][3] = "Emp Phone";
        employees[0][4] = "Emp E-Mail";
        employees[0][5] = "Emp department";

        employees[1][0] = "101";
        employees[1][1] = "Tom Modi";
        employees[1][2] = "63-01 35 Ave, Woodside, NY";
        employees[1][3] = "345-444-5456";
        employees[1][4] = "smhyyt@gmail.com";
        employees[1][5] = "QA";

        employees[2][0] = "102";
        employees[2][1] = "Kazi Mooya";
        employees[2][2] = "Jamiaca, NY";
        employees[2][3] = "939-777-8899";
        employees[2][4] = "shtdt@gmail.com";
        employees[2][5] = "Dev";

        employees[3][0] = "103";
        employees[3][1] = "Ruposri";
        employees[3][2] = "Jamiaca, NY";
        employees[3][3] = "334-666-8798";
        employees[3][4] = "rup@gmail.com";
        employees[3][5] = "Admin";

        employees[4][0] = "104";
        employees[4][1] = "Denys";
        employees[4][2] = "Manhattan, NY";
        employees[4][3] = "345-555-8790";
        employees[4][4] = "denys@gmail.com";
        employees[4][5] = "Sales";

        employees[5][0] = "105";
        employees[5][1] = "Sami Sheikh";
        employees[5][2] = "Long Island, NY";
        employees[5][3] = "234-555-9090";
        employees[5][4] = "sami@gmail.com";
        employees[5][5] = "HR";

        for (String [] employee: employees) {
            for (String emp: employee){
                System.out.println(emp);
            }
        }
    }
}
