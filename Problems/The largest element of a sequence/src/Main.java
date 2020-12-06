import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var max = 0;
        while (scanner.hasNext()) {
            var n = scanner.nextInt();
            if (n > max) {
                max = n;
            } else if (n == 0) {
                break;
            }
        }
        System.out.println(max);
    }
}