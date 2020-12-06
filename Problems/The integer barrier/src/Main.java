import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var sum = 0;
        while (scanner.hasNextInt()) {
            var num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}