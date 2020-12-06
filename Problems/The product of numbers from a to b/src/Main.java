import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        var total = 1L;
        for (int i = a; i < b; i++) {
            total *= i;
        }
        System.out.println(total);
    }
}