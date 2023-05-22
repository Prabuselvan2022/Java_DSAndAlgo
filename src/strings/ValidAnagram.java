package strings;

public class ValidAnagram {
    public static void main( String[] args ) {

        String str1 = "listen";
        String str2 = "silant";


        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        System.out.println(isValid(ch1, ch2));
    }

    static boolean isValid( char[] str1, char[] str2 ) {

        if (str1.length != str2.length) return false;
        int tempArr[] = new int[256];
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
            tempArr[str1[i]]++;
            tempArr[str2[i]]--;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i]!=0) return  false;
        }
        return true;
    }
}
