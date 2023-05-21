package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapUserDefined {
    public static void main( String[] args ) {

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("Prabu","Selvan"));
        studentMap.put(2, new Student("Dhanu","Prabu"));
        studentMap.put(3, new Student("Hari","Haran"));
        studentMap.put(4, new Student("Linga","Prabu"));
        studentMap.put(5, new Student("Dilip","Kumar"));

//        System.out.println(studentMap.values());

        Set<Map.Entry<Integer, Student>> entries = studentMap.entrySet();
        Iterator<Map.Entry<Integer, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> next = iterator.next();
            Student value = next.getValue();
            System.out.println("FirstName is -> "+value.getFirstname() +"  LastName is -> "+value.getLastname());
        }


    }
}
