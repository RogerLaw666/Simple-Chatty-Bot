class Main {
    public static void main(String[] args) {
        // put your code here
        
        var star1 = "      **";
        var star2 = "**    **";

        String[] arr = {
            "********",
            star1,
            star1,
            star1,
            star2,
            star2,
            " *******",
        };
        for (String a : arr) {
            System.out.println(a);
        }
    }
}