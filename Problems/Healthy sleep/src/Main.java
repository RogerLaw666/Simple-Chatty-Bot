import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var h = scanner.nextInt();

        if (a <= b) {
            if (h < a) {
                System.out.println("Deficiency");
            } else if (h > b) {
                System.out.println("Excess");
            } else {
                System.out.println("Normal");
            }
        }
    }
}