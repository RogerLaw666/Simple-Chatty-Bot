import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var lineA = scanner.nextLine().trim().replace(" ", "");
        var lineB = scanner.nextLine().trim().replace(" ", "");
        System.out.println(lineA.equals(lineB));
    }
}