import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var sum = 0;
        while (scanner.hasNextInt()) {
            var n = scanner.nextInt();
            if (n != 0) {
                sum += n;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}