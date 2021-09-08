package ua.com.alevel.tasks.unit4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String reversestring = Sc.nextLine();
        System.out.println(reverseString.reverse(reversestring));
        System.out.print("Enter the text: ");

        String reversewords = Sc.nextLine();
        System.out.println(reverseString.reverse(reversewords));

    }
}
