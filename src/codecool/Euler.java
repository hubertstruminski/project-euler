package codecool;

import java.util.ArrayList;
import java.util.List;

public class Euler {

    public static int findNumbersMultipliesOf3And5() {
        int sum = 0;
        for(int i=0; i<1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int findFibonacciNumber(int n) {
        int sum = 0, t1 = 0, t2 = 1;

        for(int i=1; i<=n; i++) {
            System.out.print(t1 + ", ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }

    public static List<Integer> findPrimeFactor(int number) {
        List<Integer> result = new ArrayList<>();

        for(int i=2; i<number; i++) {
            if(number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static int findSmallestMultiple() throws Exception {
        for(int i=2; i<999999999; i++) {
            int count = 0;
            for(int j=1; j<22; j++) {
                if(count == 20) {
                    return i;
                }
                if(i % j == 0) {
                    count++;
                }
            }
        }
        throw new Exception("Number not found");
    }

    public static double findSumSquare() {
        int sum_squares = 0;
        double square_sum = 0;
        for(int i=0; i<100; i++) {
            sum_squares += Math.pow(i, 2);
            square_sum += i;
        }
        square_sum = Math.pow(square_sum, 2);

        return (double) sum_squares - square_sum;
    }

    public static int findPrimeNumber() {
        List<Integer> primeNumbers = new ArrayList<>();

        for(int i=1; i<125000; i++) {
            int count = 0;
            for(int j=1; j<=i+1; j++) {
                if(count > 2 || i % 2 == 0) {
                    break;
                }
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Size prime numbers list: " + primeNumbers.size());
        return primeNumbers.get(10001);
    }

    public static String findSpecialPithagoreanTriplet() throws Exception {
        for(int a=1; a<1000; a++) {
            for(int b=1; b<1000; b++) {
                for(int c=1; c<1000; c++) {

                    int sum = a + b + c;
                    int a2 = (int) Math.pow(a, 2);
                    int b2 = (int) Math.pow(b, 2);
                    int c2 = (int) Math.pow(c, 2);

                    if(sum == 1000 && a2 + b2 == c2) {
                        return "Triplet: a = " + a + ", b = " + b + ", c = " + c;
                    }
                }
            }
        }
        throw new Exception("Special pithagorean triplet not found");
    }

    public static int findSummationOfPrimes() {
        int sum = 0;
        for(int i=2; i<2000000; i++) {
            int count = 0;
            for(int j=1; j<=i+1; j++) {
                if(count > 2 || i % 2 == 0) {
                    break;
                }
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
//        System.out.println(findNumbersMultipliesOf3And5());
//        System.out.println(findFibonacciNumber(25));
//
//        List<Integer> primeFactorsList = findPrimeFactor(13195);
//        for(Integer item: primeFactorsList) { System.out.print(item + " "); }
//
////        System.out.println("\nSmallest multiple: " + findSmallestMultiple());
//
//        System.out.println("\nDifference sum square: " + findSumSquare());
//        System.out.println("\n\n10 001st prime number is: " + findPrimeNumber());
//        System.out.println("Result: " + findSpecialPithagoreanTriplet());
//        System.out.println("Result: " + findSummationOfPrimes());
    }
}
