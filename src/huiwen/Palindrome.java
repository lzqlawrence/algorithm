package huiwen;

public class Palindrome {
    public static void main(String... args) {
        String str = "abccba";
        if (isPalindrome(str)) {
            System.out.println("--true--");
        } else {
            System.out.println("--false--");
        }
    }

    private static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }


}
