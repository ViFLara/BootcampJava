package Lists;

import java.util.Iterator;
import java.util.Queue;

public class LinkedList1 {

    public static void main(String[] args) {
        Queue<String> rowBank = new java.util.LinkedList<>();

        //Adding elements
        rowBank.add("Patricia");
        rowBank.add("Roberto");
        rowBank.add("Flavio");
        rowBank.add("Pamela");
        rowBank.add("Anderson");
        System.out.println(rowBank);

        //Removes the first item from the queue
        String customerToBeServed = rowBank.poll();
        System.out.println(customerToBeServed);
        System.out.println(rowBank);

        // Returns and doesn't remove the first element
        String firstClient = rowBank.peek();
        System.out.println(firstClient);

        // Clear
        //rowBank.clear();

        // First client or error
        String firstClientOrError = rowBank.element();
        System.out.println(firstClientOrError);

        // Goes through the queue
        for (String custumer: rowBank ) System.out.println(custumer);

        Iterator<String> iteratorRowBank = rowBank.iterator();
        while (iteratorRowBank.hasNext()) {
            System.out.println("---> " + iteratorRowBank.next());
        }
    }
}
