import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var d = scanner.nextInt();

        for (int i = 0; i <= 1000; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}