package codecool;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    private static List<Integer> listOfNumbersPalindrome = new ArrayList<>();

    public static int findPalindrome() {

        for(int i=100; i<1000; i++) {
            for(int j=100; j<1000; j++) {
                int product = i * j;
                String result = String.valueOf(product);

                int l = result.length()-1;

                int a = result.length() / 2;
                int b = 0;
                for(int k=0; k<result.length(); k++) {
                    if(b == a) {
                        listOfNumbersPalindrome.add(Integer.valueOf(result));
                    }
                    if(result.charAt(k) == result.charAt(l)) {
                        b++;
                        l--;
                    }else {
                        break;
                    }
                }
            }
        }

        int max = 101;
        for(int i=0; i<listOfNumbersPalindrome.size(); i++) {
            if (listOfNumbersPalindrome.get(i) > max) {
                max = listOfNumbersPalindrome.get(i);
            }
        }
        return max;
    }
}
