import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var num = scanner.nextLong();
        var start = 2;
        while (count(start) <= num) {
            start++;
        }
        System.out.println(start);
    }

    public static long count(int n) {
        if (n == 1) {
            return 1;
        }
        return n * count(n - 1);
    }
}