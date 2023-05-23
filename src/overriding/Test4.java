package overriding;

public class Test4 {
    public void run () {
        System.out.println("Test4 is running");
    }
}

class Test5 extends Test4 {

    public void run() {
        System.out.println("Test5 is running");
    }
    public static void main( String[] args ) {
//        Test5 obj =  new Test5();
        Test4 obj1 = new Test5();
        obj1.run();

    }
}