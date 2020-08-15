package data.structure.algorithm.link_list;

import java.util.Iterator;
import java.util.LinkedList;


public class LearnLinkList {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("James");
        names.add("Robin");
        names.add("Jamal");
        names.add("Yamina");
        names.add("Tony");
        names.add("William");
        names.add("James");


        System.out.println(names.get(6));
        System.out.println(names.getLast());
        System.out.println(names.getFirst());
        System.out.println(names);

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if (it.next() == "James"){
                System.out.println("James is there");
            }

        }

    }
}
