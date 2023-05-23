package coreJava;

public class Student5 {
    static int count=0;

    Student5() {
        count++;
        System.out.println(count);
    }

    public static void main( String[] args ) {
        Student5 stu1 = new Student5();
        Student5 stu2 = new Student5();
        Student5 stu3 = new Student5();
        Student5 stu4 = new Student5();

    }
}
