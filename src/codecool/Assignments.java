package codecool;

import java.util.ArrayList;
import java.util.List;

public class Assignments {

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

    public static long findThirteenAdjacentNumberOf1000DigitsNumber() {
        final String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

        long greatestProductAdjacentNumbers = 0;

        for(int i=0; i<number.length() - 12; i++) {
            long sum = Long.valueOf(number.charAt(i)) *
                    Long.valueOf(number.charAt(i + 1)) *
                    Long.valueOf(number.charAt(i + 2)) *
                    Long.valueOf(number.charAt(i + 3)) *
                    Long.valueOf(number.charAt(i + 4)) *
                    Long.valueOf(number.charAt(i + 5)) *
                    Long.valueOf(number.charAt(i + 6)) *
                    Long.valueOf(number.charAt(i + 7)) *
                    Long.valueOf(number.charAt(i + 8)) *
                    Long.valueOf(number.charAt(i + 9)) *
                    Long.valueOf(number.charAt(i + 10)) *
                    Long.valueOf(number.charAt(i + 11)) *
                    Long.valueOf(number.charAt(i + 12));

            if(sum > greatestProductAdjacentNumbers) {
                greatestProductAdjacentNumbers = sum;
            }
        }
        return greatestProductAdjacentNumbers;
    }
}
