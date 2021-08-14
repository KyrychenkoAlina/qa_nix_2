package ua.com.alevel;

import java.util.Arrays;
import java.util.Scanner;

public class GetCountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something:");
        String all = sc.nextLine();
        all = all.replaceAll("\\d", "");
        System.out.println(all);
        char[] chars = all.toCharArray() ;
        Arrays.sort(chars);
        System.out.println(chars);
        char c = chars[0];
        int counter = 0;
        for (int i = 0; i < chars.length; ++i) {
            char now = chars[i];
            if (now == c ) {
                counter++;
            } else {
                System.out.println(c + " " + counter);
                counter = 0;
                c = now;
            }
        }
   //     char [] ch = all.toCharArray();
   //     Arrays.sort (ch);
   //     all = String.copyValueOf (ch);

    //    for(char value :

    }
}
