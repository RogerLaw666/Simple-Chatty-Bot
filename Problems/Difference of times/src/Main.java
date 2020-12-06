import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var hour1 = scanner.nextInt();
        var min1 = scanner.nextInt();
        var seconds1 = scanner.nextInt();

        var hour2 = scanner.nextInt();
        var min2 = scanner.nextInt();
        var seconds2 = scanner.nextInt();

        var s1 = hour1 * 3600 + min1 * 60 + seconds1;
        var s2 = hour2 * 3600 + min2 * 60 + seconds2;

        System.out.println(s2 - s1);
    }
}