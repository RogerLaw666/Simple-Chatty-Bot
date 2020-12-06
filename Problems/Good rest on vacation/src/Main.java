import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var days = scanner.nextInt();
        var foodPerDay = scanner.nextInt();
        var flight = scanner.nextInt();
        var sleepPerDay = scanner.nextInt();

        System.out.println(days * foodPerDay + flight * 2 + (days - 1) * sleepPerDay);

    }

}