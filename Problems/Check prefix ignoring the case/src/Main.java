import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var str = new Scanner(System.in).nextLine();
        System.out.println(str.toLowerCase(Locale.ROOT).startsWith("j"));
    }
}