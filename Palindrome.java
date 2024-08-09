public class Palindrome{
// Write Your code here
public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    // Compare characters from both ends moving towards the center
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false; // Not a palindrome if characters don't match
        }
        left++;
        right--;
    }
    return true; // All characters matched, so it's a palindrome
}

public static void main(String[] args) {
    String testStr = "madam"; // Example string, you can change it to test other strings

    // Check if the string is a palindrome and print the result
    if (isPalindrome(testStr)) {
        System.out.println(testStr + " is a palindrome.");
    } else {
        System.out.println(testStr + " is not a palindrome.");
    }
}
}
