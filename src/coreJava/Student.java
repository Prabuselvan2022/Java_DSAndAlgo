package coreJava;

public class Student {

    int id;
    String name;
}

class Student1 {
    public static void main( String[] args ) {

        Student stu = new Student();
        stu.id=100;
        stu.name="Prabu";
        System.out.println(stu.id);
        System.out.println(stu.name);
    }
}
