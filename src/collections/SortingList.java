package collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(10);
        list1.add(0);
        list1.add(null);

        System.out.println("after sorting "+ list1.toString());
//        Collections.sort(list1);
//        Collections.reverse(list1);
//
//        System.out.println("after reverse sorting "+ list1.toString());


    }
}
