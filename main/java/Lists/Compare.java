package Lists;

import java.util.Arrays;
import java.util.Comparator;

public class Compare {
        public static class LengthComparator implements Comparator<String> {
            private int count;
            public int compare(String s1, String s2) {
                int a = s1.length();
                int b = s2.length();
                if (a < b) {
                    return -1;
                } else if (a > b) {
                    count++;
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        public static void main(String[] args) throws Exception {
            String[] sa = {"One", "Two", "Three", "Four", "Five"};
            System.out.println(Arrays.toString(sa));
            LengthComparator byLength = new LengthComparator();
            Arrays.sort(sa, byLength);
            System.out.println(Arrays.toString(sa));
            System.out.println(byLength.count);
        }
}

