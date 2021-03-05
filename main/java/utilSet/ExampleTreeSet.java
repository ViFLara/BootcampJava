package utilSet;

import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();

        // Does the tree with capitals
        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianopolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("Sao Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");
        System.out.println(treeCapitals);

        // Returns the first capital
        System.out.println(treeCapitals.first());

        // Returns the last capital
        System.out.println(treeCapitals.last());

        // Returns the first lower part of the parametric capital tree
        System.out.println(treeCapitals.lower("Florianopolis"));

        // Returns the higher first part of the parametric capital tree
        System.out.println(treeCapitals.higher("Florianopolis"));

        // Returns and removes the first capital from the tree
        System.out.println(treeCapitals.pollFirst());
        System.out.println(treeCapitals);
    }
}
