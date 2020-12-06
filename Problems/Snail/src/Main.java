import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var target = scanner.nextInt();
        var up = scanner.nextInt();
        var down = scanner.nextInt();
        var total = 0;
        var days = 0;

        while (true) {
            days++;
            total += up;
            if (total >= target) {
                break;
            }
            total -= down;
        }

        System.out.println(days);
    }
}