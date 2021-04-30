public class Recursion {

    public static void mirror(int n) {
        if (n < 0) {
            System.out.print(n + "  " + n);
        } else {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
            for (int i = 0; i <= n; i++) {
                System.out.print(" " + i);
            }
        }
    }

    public static void mirror1(int n) {
        System.out.print(n + " ");
        if (n > 0) mirror1(n - 1); // Recursive call
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        mirror(5);
        System.out.println();
        mirror(5);
    }
}
