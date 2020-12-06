import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var a = 0;
        var b = 0;
        var c = 0;
        var d = 0;
        for (int i = 0; i < n; i++) {
            var f = scanner.nextInt();
            if (f == 2) {
                d++;
            } else if (f == 3) {
                c++;
            } else if (f == 4) {
                b++;
            } else if (f == 5) {
                a++;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}