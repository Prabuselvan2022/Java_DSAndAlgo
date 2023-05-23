package strings;

public class Test1 {

    public static void main( String[] args ) {

        String str1="prabu";
        String str2="prabu";
        String str3 = new String("prabu");

        System.out.println(str1==str2); // comparing the references
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));




    }
}
