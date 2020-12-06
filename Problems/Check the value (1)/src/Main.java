import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var num = scanner.nextInt();
        System.out.println(num < 10 && num > 0);
    }
}