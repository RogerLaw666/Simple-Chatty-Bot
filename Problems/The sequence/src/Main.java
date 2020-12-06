import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var num = scanner.nextInt();

        var arrList = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            var n = scanner.nextInt();
            if (n % 4 == 0) {
                arrList.add(n);
            }
        }

        var max = 0;
        for (int n : arrList) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println(max);
    }
}