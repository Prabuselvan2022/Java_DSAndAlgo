package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();
        list1.add("element1");
        list1.add("element2");
        list1.add("element4");
        list1.add("element3");

        List<String> list2 = new ArrayList<>(list1);
        list2.add("element5");
        list2.add("element6");
        list2.add("element7");
        list2.add("element8");
        list2.set(5,"element9");

//        for(int i=0; i<list1.size(); i++) System.out.println(list1.get(i));

        list2.forEach((el)-> {
            System.out.println("el" + el);
        });


        list2.stream().forEach((element)-> {
            System.out.println("Using Streams "+ element);
        });
        }
}
