package ua.com.alevel;

import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write numbers: ");
        String all = sc.nextLine();
        int sum = 0;
        var numbers = all.split("\\D");
        for (var num : numbers) {
            if (!num.equals("")) {
                sum += Integer.parseInt(num);
            }
        }
        System.out.println(sum);
    }
}
