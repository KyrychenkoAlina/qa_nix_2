package ua.com.alevel.tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter the number (1-3) of task or enter 'break' to quit:");
            String command = in.nextLine();

            if (command.startsWith("break")){
                break;
            }

            System.out.println("Please, enter the input string:");
            String input = in.nextLine();

            switch (command) {
                case "1": {
                    int result = FirstTask.sumNumbersInString(input);
                    System.out.println(result);
                }
                break;
                case "2": {
                    String result = SecondTask.getCharacterStatistics(input);
                    System.out.println(result);
                }
                break;
                case "3": {
                    //TODO: Task3
                }
                break;
            }
        }
    }
}
