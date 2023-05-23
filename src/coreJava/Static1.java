package coreJava;

public class Static1 {

    //    static {
//        System.out.println("Static block is invoked");
//        System.exit(0);
//    }
//    static {
//        System.out.println("This is Static block");
//    }

    int a=10;
    static int b=100;

    public static void main( String[] args ) {
        Static1 obj = new Static1();
        System.out.println("a "+ obj.a);
        System.out.println("b is "+ b);
        System.out.println("Main method");
    }
}

