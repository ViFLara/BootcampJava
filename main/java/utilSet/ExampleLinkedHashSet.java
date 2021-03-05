package utilSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numericSequence = new LinkedHashSet<>();

        //Adding numbers
        numericSequence.add(1);
        numericSequence.add(2);
        numericSequence.add(4);
      /* numericSequence.add(8);
        numericSequence.add(16); */
        System.out.println(numericSequence);

        // Removes the number from set
        /*numericSequence.remove(4);
        System.out.println(numericSequence);

        Returns the quantity items
        System.out.println(numericSequence.size()); */

        // Goes through the items
        Iterator<Integer> iterator = numericSequence.iterator();

        while (iterator.hasNext()) {
        }

        for (Integer number: numericSequence) System.out.println(number);

        // Returns if the set is empty
        System.out.println(numericSequence.isEmpty());
    }

}
