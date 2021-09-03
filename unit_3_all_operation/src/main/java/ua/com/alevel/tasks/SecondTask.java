package ua.com.alevel.tasks;

import java.util.Arrays;

public class SecondTask {
    public static String getCharacterStatistics(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);

        char c = chars[0];
        int counter = 0;
        for (int i = 0; i < chars.length; ++i) {
            char now = chars[i];
            if (now == c) {
                counter++;
            } else {
                sb.append(c + " " + counter + "\n");
                counter = 0;
                c = now;
            }
        }
        return sb.toString();
    }
}
