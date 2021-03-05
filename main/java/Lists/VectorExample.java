package Lists;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        /* Adding 4 sports into vector */
        sports.add("Football");
        sports.add("Basket");
        sports.add("Tennis");
        sports.add("Handball");
        System.out.println(sports);

        /* Changes the value of position 2 */
        sports.set(2, "Ping Pong");
        System.out.println(sports);

        /* Removes Handball from vector */
        sports.remove(2);
        System.out.println(sports);

        /* Returns the first item from vector */
        System.out.println(sports.get(0));

        for (String sport: sports) {
            System.out.println(sport);
        }

    }
}
