package mykyta.kotelevets;

public class HomeWorkTwo {
    public static void main(String[] args) {
        String str = "I hate Git";
        String str_2 = "LOL";
        int wordsAmount = wordsCount(str);
        System.out.println("How many words in the sentence? - " + wordsAmount);
        // вирішив не додавати сканер, тому що у завданні
        // не було сказано про нього, але можу переробити зі сканером
        boolean palindrome = isPalindrome(str_2);
        System.out.println("Is the word" + str_2 + "a palindrome? - " + palindrome);
    }

    public static int wordsCount(String str) {
        String[] value = str.split("\\s+");
        return value.length;
    }

    public static boolean isPalindrome(String str_2) {
        int left = 0, right = str_2.length() - 1;
        while (left < right) {
            if (str_2.charAt(left) != str_2.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}