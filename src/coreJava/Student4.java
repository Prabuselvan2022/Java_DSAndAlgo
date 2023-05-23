package coreJava;

public class Student4 {
    int id;
    String name;

    static String college="Pavai";

    Student4(int id,String name) {
        this.id=id;
        this.name=name;
    }

    static void change() {
        college="Anna university";
    }

    public void display() {
        System.out.println("id is "+id + " name is "+name + "college is  "+ college);
    }

    public static void main( String[] args ) {
        Student4.change();
        Student4 s1= new Student4(100, "Prabu");
        s1.display();

    }
}
