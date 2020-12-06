import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var num = new Scanner(System.in).nextInt();

        var current = 1;
        while (current * current <= num) {
            System.out.println(current * current);
            current++;
        }
    }
}