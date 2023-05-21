package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(23,"Prabu",500,33));
        list1.add(new Employee(100,"Dhanu",1000,27));
        list1.add(new Employee(53,"Hari",5000,35));
        list1.add(new Employee(10,"Dilip",10000,53));
        list1.add(new Employee(73,"Himanshu",100000,27));

        Collections.sort(list1, new MySort());
        Collections.sort(list1, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getAge()-o1.getAge());
            }
        });
        System.out.println(list1);
    }
}

class  MySort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getId()-o2.getId());
    }

}
