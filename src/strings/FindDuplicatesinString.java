package strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesinString {

    public static void main( String[] args ) {
        String str = "geeksforgeeks";
        printDup(str);

    }

    static void printDup( String str ) {

        Map<Character, Integer> hmap = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!hmap.containsKey(c)) {
                hmap.put(c, 1);
            } else {
                hmap.put(c, hmap.get(c) + 1);
            }

            for (Map.Entry element : hmap.entrySet()) {
                char ch = (char) element.getKey();
                int val = (int) element.getValue();
                System.out.println("character is " + ch +"--> Value is " + val);
                System.out.println("Value is " + val);
            }
        }
    }
}