import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var ga = scanner.nextInt();
        var gb = scanner.nextInt();
        var gc = scanner.nextInt();

        System.out.println(ga / 2 + gb / 2 + gc / 2 + ga % 2 + gb % 2 + gc % 2);
    }
}