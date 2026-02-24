public class Practice {

    static void numberTriangular(int n) {
        System.out.println("\nNumber Triangular");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void numberTriangularReverse (int n) {
        System.out.println("\nNumber Triangular Reverse: ");
        for (int i = n; i >= 1; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;

        numberTriangular(n);
        numberTriangularReverse(n);
    }
}
