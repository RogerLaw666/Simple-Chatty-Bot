import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        var scanner = new Scanner(System.in);
        var busHeight = scanner.nextInt();
        var numOfBridges = scanner.nextInt();

        boolean isSafe = true;
        for (int i = 0; i < numOfBridges; i++) {
            var bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                isSafe = false;
                break;
            }
        }

        if (isSafe) {
            System.out.println("Will not crash");
        }
    }
}