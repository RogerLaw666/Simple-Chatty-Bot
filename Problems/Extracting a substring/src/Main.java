import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var str = scanner.next();
        var start = scanner.nextInt();
        var end = scanner.nextInt();

        System.out.println(str.substring(start, end + 1));
    }
}