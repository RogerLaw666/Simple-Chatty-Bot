import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var start = scanner.nextInt();
        var end = scanner.nextInt();
        var sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}