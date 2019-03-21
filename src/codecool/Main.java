package codecool;

import static codecool.AdjacentNumbers.findThirteenAdjacentNumberOf1000DigitsNumber;
import static codecool.Palindrome.findPalindrome;

public class Main {

    public static void main(String[] args) {
        System.out.println("The most biggest 3-digits of number is: " + findPalindrome());
        System.out.println("The greatest product of adjacent thirteen numbers of 1000-digits number: " + findThirteenAdjacentNumberOf1000DigitsNumber());
    }
}
