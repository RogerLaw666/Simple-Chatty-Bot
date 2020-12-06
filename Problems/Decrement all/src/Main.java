import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var d = scanner.nextInt();

        System.out.print(--a);
        System.out.print(" ");
        System.out.print(--b);
        System.out.print(" ");
        System.out.print(--c);
        System.out.print(" ");
        System.out.print(--d);
    }
}