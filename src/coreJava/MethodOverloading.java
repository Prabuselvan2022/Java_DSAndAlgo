package coreJava;


public class MethodOverloading {

    static int add (int a,int b) {
        return  a+b;
    }
    static double add(double a, double b, double c) {
        return a+b+c;
    }

    public static void main( String[] args ) {
        System.out.println(MethodOverloading.add(10,20));
        System.out.println(MethodOverloading.add(10,20,30));
    }

}
