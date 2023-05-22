package programs;

public class OddNumbers {
    public static void main( String[] args ) {
        int count = 50;

        for (int i=1; i<count; i++) {
            if(i%2==0) {
                System.out.println(" odd numbers are "+ i);
            }
        }
    }
}
