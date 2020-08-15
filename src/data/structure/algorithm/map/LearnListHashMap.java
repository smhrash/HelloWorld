package data.structure.algorithm.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {
    public static void main(String[] args) {

        List<String> stateListOfUK = new ArrayList<>();
        stateListOfUK.add("London");
        stateListOfUK.add("England");
        stateListOfUK.add("Wales");
        stateListOfUK.add("Ireland");


        List<String> stateListOfUSA = new ArrayList<>();
        stateListOfUSA.add("New York");
        stateListOfUSA.add("New Jersey");
        stateListOfUSA.add("California");
        stateListOfUSA.add("Nevada");
        stateListOfUSA.add("Connecticut");
        stateListOfUSA.add("Delaware");
        stateListOfUSA.add("Washington");


        Map<String, List<String>> mapList = new HashMap<>();
        mapList.put("United States Of America", stateListOfUSA);
        mapList.put("United Kingdom", stateListOfUK);


        for (Map.Entry<String, List<String>> entry : mapList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

}
