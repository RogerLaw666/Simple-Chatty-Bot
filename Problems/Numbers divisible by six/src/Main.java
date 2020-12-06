import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var num = scanner.nextInt();

        var sum = 0;
        for (int i = 0; i < num; i++) {
            var n = scanner.nextInt();
            if (n % 6 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}