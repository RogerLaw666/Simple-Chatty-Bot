import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var num = new Scanner(System.in).nextInt();

        switch (num) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}