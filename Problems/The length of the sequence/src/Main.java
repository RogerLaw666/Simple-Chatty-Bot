import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var i = 0;
        while (scanner.hasNextInt()) {
            var num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                i++;
            }
        }

        System.out.println(i);
    }
}