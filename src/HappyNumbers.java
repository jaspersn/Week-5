import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

    // Returns the sum of all the digits in a given number
    public static int sumOfSquares(int n) {
        int sum = 0;
        // Break off digits and sum their squares
        while (n > 0) {
            sum += (n%10)*(n%10); // Sum = sum + digit ^ 2
            n /= 10; // Next digit
        }
        return sum;
    }

    // Returns whether the given number is happy
    public static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();
        int sum = 0;
        while (sum != 1) {
            sum = sumOfSquares(n); // Sum equals sum of digits squared
            if (!seen.add(sum)) break; // Sum already seen (avoids infinite loop)
            n = sum; // Next number (digits of sum)
        }
        return sum == 1;
    }

    public static void main(String[] args) {
        int n = 139;
        System.out.println(n + " = " + isHappyNumber(n));
        int n1 = 4;
        System.out.println(n1 + " = " + isHappyNumber(n1));
    }
}
