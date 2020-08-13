package oop.encapsulation;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp= new Employee();
        emp.setEmpName("Sarker Rashid");
        emp.setEmpAge(34);
        emp.setEmpSSN( 234556674);
        emp.setEmpPhone(345_555_8855L);

        System.out.println("Employee Name: "+ emp.getEmpName());
        System.out.println("Employee age: "+ emp.getEmpAge());
        System.out.println("Employee SSN: "+ emp.getEmpSSN());
        System.out.println("Employee Phone: "+ emp.getEmpPhone());
    }
}
