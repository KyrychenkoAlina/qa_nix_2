package ua.com.alevel.tasks;

public class FirstTask {
    public static int sumNumbersInString(String input){
        int sum = 0;
        var numbers = input.split("\\D");
        for (var num : numbers) {
            if (!num.equals("")) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }
}
