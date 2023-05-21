package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main( String[] args ) {
        Set<Integer> h1 = new HashSet();
        h1.add(1);
        h1.add(1);
        h1.add(1);
        h1.add(1);
        h1.add(null);

        h1.add(2);
        h1.add(3);
        h1.add(4);
        h1.add(5);
//Set will override the duplicates
//Hashset is the unordered elements
        System.out.println(h1.toString());

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Java");
        hashSet.add("Javascript");
        hashSet.add("Go");
        hashSet.add("Scala");
        hashSet.add("Mojo");

//        System.out.println(hashSet);

        hashSet.add("Java");

//        System.out.println(hashSet);

        hashSet.stream().forEach(( element ) -> {
            System.out.println("Using Stream " + element);
        });

        for (String str : hashSet) {
            System.out.println("Using enhanced for loop " + str);
        }

        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String element = (String) it.next();
            System.out.println("using iterator " + element);
        }
        hashSet.stream().filter(course -> !"Java".equals(course)).forEach(course -> System.out.println("courses are " + course));


    }
}
