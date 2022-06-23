package darTasks;

import java.util.Scanner;

public class PolindromeTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int digit, result = 0;
        String strX = Integer.toString(x);

        while (x > 0){
            digit = x % 10;
            result = result * 10 + digit;
            x /= 10;
        }
        String strResult = Integer.toString(result);
        String strResult2 = "";

        for (int i = strResult.length() - 1; i >= 0; i--) {
            strResult2 += strResult.charAt(i);
        }

        if (strX.equals(strResult2)){
            return true;
        }
        return false;
    }
}
