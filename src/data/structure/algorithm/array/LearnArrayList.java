package data.structure.algorithm.array;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

    public static void main(String[] args) {

        int [] num = new int[10];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(12);
        ar.add(24);

        System.out.println(ar.size());

        System.out.println(ar.get(2));
        ar.add(40);
        ar.add(45);
        ar.add(60);
        ar.add(45);

        System.out.println(ar.size());
        System.out.println(ar.get(6));

        System.out.println("============================");

        for (int i =0; i< 7; i++){
            System.out.println(ar.get(i));
        }

        System.out.println("============================");



        ArrayList<String> names = new ArrayList<String>();
        names.add("James Goeslin");
        names.add("Sarker Rashid");
        names.add("Sami Sheikh");

        System.out.println(names.size());
        System.out.println(names.get(1));


        for (int i =0; i< 3; i++){
            System.out.println(names.get(i));
        }


        Employee emp1=new Employee("Sarker",35,"Admin");
        Employee emp4=new Employee("Rahid",32,"HR");
        Employee emp2=new Employee("Sami",30,"QA");
        Employee emp3=new Employee("Maoya",36,"Dev");

        System.out.println("======================================");

        ArrayList<Employee> emp= new ArrayList<Employee>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        Iterator<Employee> it = emp.iterator();
        while (it.hasNext()){
            Employee em = it.next();
            System.out.println(em.name);
            System.out.println(em.age);
            System.out.println(em.dep);
            System.out.println("==============");
        }

        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("James Camerun");
        names1.add("Sarker Salah");
        names1.add("Sami Haque");

        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Rony Miah");
        names2.add("Rashid Khalid");
        names2.add("Sheikh Rasel");

        names1.addAll(names2);
        for (int i =0; i < names1.size(); i++){
            System.out.println(names1.get(i));
        }

        System.out.println("============================");
        names1.removeAll(names2);


        for (int i =0; i < names1.size(); i++){
            System.out.println(names1.get(i));
        }

    }

}
