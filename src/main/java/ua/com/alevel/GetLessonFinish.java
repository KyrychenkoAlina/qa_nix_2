package ua.com.alevel;

import java.util.Scanner;

public class GetLessonFinish {
    public static void main(String[] params) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lesson:");
        int lesson = sc.nextInt();
        int oddBreak = 15;
        int evenBreak = 5;
        int lessonTime = 45;
        int start = 9 * 60;

        int oddCount = (lesson - 1) / 2 ;
        int evenCount = (lesson - 1) - oddCount;
        int result = start + lesson * lessonTime + oddCount * oddBreak + evenCount * evenBreak;

        int hours = result / 60;
        int minutes = result % 60;
        System.out.println(hours + ":" + minutes);
    }
}
