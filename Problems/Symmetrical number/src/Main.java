import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var num = scanner.nextInt();
        if (num / 1000 > 0 && num / 1000 < 10) {
            var a = num % 10;
            var b = num / 10 % 10;
            var c = num / 100 % 10;
            var d = num / 1000 % 10;

            if (a == d && b == c) {
                System.out.println(1);
            } else {
                System.out.println(new Random().nextInt(100));
            }
        }
    }
}