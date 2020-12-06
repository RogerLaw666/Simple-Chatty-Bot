import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var isJudged = false;
        var isAscending = true;
        var isSequence = true;
        var lastNum = scanner.nextInt();
        while (scanner.hasNextInt()) {
            var num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                if (!isJudged) {
                    if (num > lastNum) {
                        isJudged = true;
                    } else if (num < lastNum) {
                        isAscending = false;
                        isJudged = true;
                    }
                } else {
                    if (isAscending && num < lastNum || !isAscending && num > lastNum) {
                        isSequence = false;
                        break;
                    }
                }
                lastNum = num;
            }
        }
        System.out.println(isSequence);
    }
}