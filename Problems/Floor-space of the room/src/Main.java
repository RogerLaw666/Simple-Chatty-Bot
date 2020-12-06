import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var pie = 3.14;
        var scanner = new Scanner(System.in);
        var type = scanner.nextLine();
        switch (type) {
            case "triangle":
                var ta = scanner.nextDouble();
                var tb = scanner.nextDouble();
                var tc = scanner.nextDouble();
                var zhou = (ta + tb + tc) / 2;
                System.out.println(Math.sqrt(zhou * (zhou - ta) * (zhou - tb) * (zhou - tc)));
                break;
            case "rectangle":
                System.out.println(scanner.nextDouble() * scanner.nextDouble());
                break;
            case "circle":
                var c = scanner.nextDouble();
                System.out.println(pie * c * c);
                break;
        }
    }
}