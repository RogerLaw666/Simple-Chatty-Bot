import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        int numOfNum = 0;
        double sumOfNum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                numOfNum++;
                sumOfNum += i;
            }
        }

        System.out.println(sumOfNum / numOfNum);
    }
}