import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var x1 = scanner.nextInt();
        var y1 = scanner.nextInt();
        var x2 = scanner.nextInt();
        var y2 = scanner.nextInt();

        if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}