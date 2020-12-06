import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var num = scanner.nextInt();
        var a = num % 10;
        var b = num / 10 % 10;
        var c = num / 100 % 10;
        System.out.println(a + b + c);
    }
}