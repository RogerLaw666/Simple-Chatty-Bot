import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var k = scanner.nextInt();

        if (n * m >= k && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}