package strings;

public class AbsClass  extends Test2 {
    @Override
    public void sample( ) {
        System.out.println("This is sample from abstract from AbsClass");
    }

    public static void main( String[] args ) {
        AbsClass obj = new AbsClass();
        obj.sample();
        obj.sample1();
    }
}
