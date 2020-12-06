import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var a = scanner.next();
        var arr = a.split("");
        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                if (!arr[i].equals("0")) {
                    str.append(arr[i]);
                }
            } else {
                str.append(arr[i]);
            }
        }
        System.out.println(str);
    }
}