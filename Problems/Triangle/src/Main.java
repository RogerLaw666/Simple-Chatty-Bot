import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var A = scanner.nextInt();
        var B = scanner.nextInt();
        var C = scanner.nextInt();
        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}