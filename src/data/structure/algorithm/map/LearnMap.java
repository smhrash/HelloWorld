package data.structure.algorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    public static void main(String[] args) {

        Map<String, String> stateMap = new HashMap<>();
        stateMap.put("Dhaka", "Bangladesh");
        stateMap.put("New York", "United State of America");
        stateMap.put("London", "United Kingdom");
        stateMap.put("Ottawa", "Canada");
        stateMap.put("Melbourne", "Australia");
        stateMap.put("Auckland", "New Zealand");

        for (Map.Entry<String, String> sm : stateMap.entrySet()) {
            System.out.println("State: " + sm.getKey() + ", " + "" + "Country: " + sm.getValue());
        }
        System.out.println(stateMap.get("Dhaka"));


        Map<String,Integer> pizzas= new HashMap<>();
        pizzas.put("American Pizza",70);
        pizzas.put("Italian Pizza",60);
        pizzas.put("Mexican Pizza",50);
        pizzas.put("Dominos Pizza",40);

        for (Map.Entry<String,Integer> pazza : pizzas.entrySet()){
            System.out.println(pazza.getKey()+" is $ "+pazza.getValue());
        }
        System.out.println("================= another way =======================");

        for (String pzza : pizzas.keySet()){
            System.out.println(pzza+" : "+pizzas.get(pzza));
        }

    }
}
