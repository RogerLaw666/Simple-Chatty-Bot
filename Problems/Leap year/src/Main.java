import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var n = new Scanner(System.in).nextInt();
        if (1900 <= n && n <= 3000) {
            if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}