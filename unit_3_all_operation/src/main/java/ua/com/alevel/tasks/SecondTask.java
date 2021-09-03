package ua.com.alevel.tasks;

import java.util.Arrays;

public class SecondTask {
    public static String getCharacterStatistics(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);

        char c = chars[0];
        int counter = 0;
        for (char chr : chars) {
            if (chr == c) {
                counter++;
            } else {
                sb.append(c + " " + counter + "\n");
                counter = 1;
                c = chr;
            }
        }
        if (counter != 0)
        {
            sb.append(c + " " + counter);
        }
        return sb.toString();
    }
}
