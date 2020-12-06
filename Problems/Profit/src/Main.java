import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        var scanner = new Scanner(System.in);
        var m = scanner.nextDouble();
        var p = scanner.nextDouble();
        var k = scanner.nextDouble();

        var y = 0;
        while (m < k) {
            m = m + m * p / 100;
            y++;
        }
        System.out.println(y);
    }
}