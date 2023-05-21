package collections;

import java.util.*;

public class HashMapDemo {
    public static void main( String[] args ) {
        Map<String, Integer> numbermapping = new HashMap<>();
        numbermapping.put("one", 1);
        numbermapping.put("two", 2);
        numbermapping.put("three", 3);
        numbermapping.put("four", 4);
        numbermapping.put("five", 5);
        numbermapping.put("null", 5);
        numbermapping.put("null", 6);


        System.out.println("contains" + numbermapping.containsKey("two"));
        System.out.println("isempty " + numbermapping.isEmpty());
        System.out.println("size is " + numbermapping.size());
        System.out.println(numbermapping.toString());

        Set<String> keys = numbermapping.keySet();
        System.out.println("keys are " + keys);

//        List<Integer> list1 = (List<Integer>) numbermapping.values();

        Collection<Integer> list1 = numbermapping.values();
        System.out.println(list1);
        System.out.println("*************Using For loop *********");
        for (Map.Entry<String, Integer> entry : numbermapping.entrySet()) {
            System.out.println("key is " + entry.getKey() + "  value is " + entry.getValue());
        }
        System.out.println("*************Using Iterator *********");
        Set<Map.Entry<String, Integer>> entry = numbermapping.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entry.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> itr = it.next();
            System.out.println("key is " + itr.getKey() + " value is " + itr.getValue());
        }
        System.out.println("*************Using ForEach *********");
        numbermapping.forEach(( K, V ) -> {
            System.out.println("Key is " + K);
            System.out.println("Value is " + V);
        });


    }
}
