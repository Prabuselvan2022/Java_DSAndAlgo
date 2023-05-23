package strings;

public class Test implements interface1,interface2 {
    @Override
    public void displayName( ) {
        System.out.println("Display Name from interface");
    }

    @Override
    public void displayAge( ) {
        System.out.println("Display Age from interface");
    }

    public static void main( String[] args ) {
        Test obj = new Test();
        obj.displayName();
        obj.displayAge();

    }
}
