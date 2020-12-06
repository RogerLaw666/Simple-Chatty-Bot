import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var num = scanner.nextInt();
        var isWeekend = scanner.nextBoolean();

        System.out.println(!isWeekend && num >= 10 && num <= 20 || isWeekend && num >= 15 && num <= 25);
    }
}