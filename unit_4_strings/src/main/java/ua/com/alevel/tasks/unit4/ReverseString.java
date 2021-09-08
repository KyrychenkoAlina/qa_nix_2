package ua.com.alevel.tasks.unit4;

import org.jetbrains.annotations.Contract;

public class ReverseString {
    public static String reverse(String str){
        String result = "";
        char[] array = str.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    private static String reverseWords(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i ++) {
            result = result + " " + reverse(words[i]);
        }
        return result.trim();
    }
    public static String reverse(String str, boolean reverseAll) {
        if (reverseAll) {
            return reverse(str);
        } else {
            return reverseWords(str);

        }
    }

        public static String reverse(String str, String str2) {
            return str.replace(str, reverse(str2, true));
        }

        public static String reverse(String str, int start, int end) {
            if (start >= str.length() | start > end | end > str.length()) {
                return "Incorrect indexes";
            }
            String sub = str.substring(start, end + 1);
            String result = reverseWords(sub);
            return str.replace(sub, result);
        }
    }

