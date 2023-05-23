package coreJava;

public class Student2 {

    int id;
    String name;

    public void insertRecord(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public void displayInfo() {
        System.out.println("id is "+this.id);
        System.out.println("name is "+this.name);
    }
}

class Student3 {
    public static void main( String[] args ) {
        Student2 stu=  new Student2();
        stu.insertRecord(100, "Prabu");
        stu.displayInfo();
        System.out.println(stu);
    }
}