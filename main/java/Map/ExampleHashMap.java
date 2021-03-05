package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {

        Map<String, List<Integer>> championsFifa = new HashMap<>();

        // Adding champions
        championsFifa.put("Brazil", Collections.singletonList(5));
        championsFifa.put("Germany", Collections.singletonList(4));
        championsFifa.put("Italy", Collections.singletonList(4));
        championsFifa.put("Uruguay", Collections.singletonList(2));
        championsFifa.put("Argentina", Collections.singletonList(2));
        championsFifa.put("France", Collections.singletonList(1));
        championsFifa.put("England", Collections.singletonList(1));
        championsFifa.put("Spain", Collections.singletonList(1));
        System.out.println(championsFifa);

        // Updates value for the Brazil key
        championsFifa.put("Brazil", Collections.singletonList(6));
        System.out.println(championsFifa);

        // Returns Argentina
        System.out.println(championsFifa.get("Argentina"));

        // Returns if there is France
        System.out.println(championsFifa.containsKey("France"));

        // Removes the France champion
        championsFifa.remove("France");

        // Returns if there is France
        System.out.println(championsFifa.containsKey("France"));

        // Returns if there is a six-time champion team
        System.out.println(championsFifa.containsValue(6));

        // Returns the size
        System.out.println(championsFifa.size());
        System.out.println(championsFifa);

        // Goes through the records
        for (Map.Entry<String, List<Integer>> entry: championsFifa.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        // Goes through the records
        for (String key : championsFifa.keySet()) {
            System.out.println(key + "---" + championsFifa.get(key));
        }
        System.out.println(championsFifa);

        // Verifies if has USA
        System.out.println(championsFifa.containsKey("Unites States"));

        // Verifies if has the value 5
        System.out.println(championsFifa.containsValue(5));

        // Verifies the value before and after clean the map
        System.out.println(championsFifa.size());

        championsFifa.clear();

        System.out.println(championsFifa.size());

    }
}
