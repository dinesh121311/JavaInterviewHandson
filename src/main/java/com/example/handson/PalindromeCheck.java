package com.example.handson;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }
}
