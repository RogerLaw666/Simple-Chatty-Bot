import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var i1 = scanner.nextLong();
        var sign = scanner.next();
        var i2 = scanner.nextLong();

        switch (sign) {
            case "+":
                System.out.println(i1 + i2);
                break;
            case "-":
                System.out.println(i1 - i2);
                break;
            case "/":
                if (i2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(i1 / i2);
                }
                break;
            case "*":
                System.out.println(i1 * i2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}