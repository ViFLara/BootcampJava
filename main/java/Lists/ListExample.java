package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Carlos");
        names.add("Pedro");
        names.add("Juliana");
        names.add("Anderson");
        names.add("Maria");
        names.add("Joao");
        System.out.println(names);

        /* Changes the value of position 2 */
        names.set(2, "Larissa");
        System.out.println(names);

        /* Names in alphabetical order */
        Collections.sort(names);

        // Removes the index 4
        int index = 4;
        names.remove(index);
        System.out.println(names);

        // Gets the first position
        String name = names.get(1);
        System.out.println(name);

        // Show the list size
        int size = names.size();
        System.out.println(size);

        // Shows if the list contains Anderson
        boolean haveAnderson = names.contains("Anderson");
        System.out.println(haveAnderson);

        // Shows the item position
        int position = names.indexOf("Carlos");
        System.out.println(position);

        // Browse the list
        for (String nameItem: names) System.out.println("---> " + nameItem);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) System.out.println("-----> " + iterator.next());

        // New list appends older list
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Ismael");
        newNames.add("Maria");
        System.out.println(newNames);
        newNames.addAll(names);
        System.out.println(newNames);
    }
}
