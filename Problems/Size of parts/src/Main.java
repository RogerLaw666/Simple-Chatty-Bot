import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var num = scanner.nextInt();
        var a = 0;
        var b = 0;
        var c = 0;
        for (int i = 0; i < num; i++) {
            var n = scanner.nextInt();
            if (n == 0) {
                a++;
            } else if (n == 1) {
                b++;
            } else if (n == -1) {
                c++;
            }
        }

        System.out.println(a + " " + b + " " + c);
    }
}