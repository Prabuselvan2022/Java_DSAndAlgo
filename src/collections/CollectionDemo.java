package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> coldemo= new ArrayList<>();
        coldemo.add("banana");
        coldemo.add("apple");
        coldemo.add("mango");
        coldemo.add(null);
        coldemo.add(null);


        System.out.println(coldemo);

//        coldemo.remove("banana");

//        System.out.println("After removal"+ coldemo);

//        System.out.println("contains "+ coldemo.contains("mango"));
//        System.out.println("contains "+ coldemo.contains("banana"));

//        coldemo.forEach((element)-> {
//            System.out.println("contains "+ coldemo.contains("mango"));
//        });

        Iterator it = coldemo.iterator();
        while(it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);

        }
//        coldemo.clear();

//        System.out.println("removed all "+ coldemo);
    }
}

