package Strings.stringBuilder;
import java.util.*;

public class integerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";

        // Convert integer to binary manually
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n /= 2;
        }

        System.out.println("Binary: " + binary);

        // Palindrome check
        int left = 0;
        int right = binary.length() - 1;
        boolean isPalindrome = true;

        while (left <= right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
