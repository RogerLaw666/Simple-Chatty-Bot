import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var num = scanner.nextInt();

        var total = 0;
        var n = 1;
        while (total < num) {
            for (var j = 0; j < n; j++) {
                System.out.println(n);
                total++;
                if (total >= num) {
                    break;
                }
            }
            n++;
        }
    }
}