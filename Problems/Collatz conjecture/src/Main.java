import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var num = new Scanner(System.in).nextInt();

        while (true) {
            System.out.print(num + " ");
            if (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
            }else{
                break;
            }
        }
    }
}