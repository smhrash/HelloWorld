package data.structure.algorithm.array;

public class Learn3DArray {

    public static void main(String[] args) {

        String[][][] employees = new String[4][4][4];

        employees[0][0][0] = "Sl";
        employees[0][0][1] = "Emp Name";
        employees[0][0][2] = "Phone";
        employees[0][0][3] = "Address";

        employees[0][1][0] = "1";
        employees[0][1][1] = "Rubi";
        employees[0][1][2] = "347-444-9999";
        employees[0][1][3] = "Queens, NY";

        employees[0][2][0] = "2";
        employees[0][2][1] = "Rashid";
        employees[0][2][2] = "347-444-9098";
        employees[0][2][3] = "Woodside, NY";

        employees[0][3][0] = "3";
        employees[0][3][1] = "Kazi Maoya";
        employees[0][3][2] = "939-888-0000";
        employees[0][3][3] = "Jamaica, NY";

        employees[1][0][0] = "Sl";
        employees[1][0][1] = "Emp Name";
        employees[1][0][2] = "Phone";
        employees[1][0][3] = "Address";

        employees[1][1][0] = "1";
        employees[1][1][1] = "Rubi";
        employees[1][1][2] = "347-444-9999";
        employees[1][1][3] = "Queens, NY";

        employees[1][2][0] = "2";
        employees[1][2][1] = "Rashid";
        employees[1][2][2] = "347-444-9098";
        employees[1][2][3] = "Woodside, NY";

        employees[1][3][0] = "3";
        employees[1][3][1] = "Kazi Maoya";
        employees[1][3][2] = "939-888-0000";
        employees[1][3][3] = "Jamaica, NY";

        employees[2][0][0] = "Sl";
        employees[2][0][1] = "Emp Name";
        employees[2][0][2] = "Phone";
        employees[2][0][3] = "Address";

        employees[2][1][0] = "1";
        employees[2][1][1] = "Rubi";
        employees[2][1][2] = "347-444-9999";
        employees[2][1][3] = "Queens, NY";

        employees[2][2][0] = "2";
        employees[2][2][1] = "Rashid";
        employees[2][2][2] = "347-444-9098";
        employees[2][2][3] = "Woodside, NY";

        employees[2][3][0] = "3";
        employees[2][3][1] = "Kazi Maoya";
        employees[2][3][2] = "939-888-0000";
        employees[2][3][3] = "Jamaica, NY";

        employees[3][0][0] = "Sl";
        employees[3][0][1] = "Emp Name";
        employees[3][0][2] = "Phone";
        employees[3][0][3] = "Address";

        employees[3][1][0] = "1";
        employees[3][1][1] = "Rubi";
        employees[3][1][2] = "347-444-9999";
        employees[3][1][3] = "Queens, NY";

        employees[3][2][0] = "2";
        employees[3][2][1] = "Rashid";
        employees[3][2][2] = "347-444-9098";
        employees[3][2][3] = "Woodside, NY";

        employees[3][3][0] = "3";
        employees[3][3][1] = "Kazi Maoya";
        employees[3][3][2] = "939-888-0000";
        employees[3][3][3] = "Jamaica, NY";

        for ( String [][] employee:employees){
            for (String [] emp : employee){
                for (String em:emp){
                    System.out.println(em);
                }
            }
        }



    }
}
