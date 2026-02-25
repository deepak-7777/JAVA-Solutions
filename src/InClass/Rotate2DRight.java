package InClass;

public class Rotate2DRight {
    public static void main(String[] args) {

        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rows = 3;
        int cols = 3;

        for (int i = 0; i < rows; i++) {
            int last = a[i][cols - 1];
            for (int j = cols - 1; j > 0; j--) {
                a[i][j] = a[i][j - 1];
            }
            a[i][0] = last;
        }
        System.out.println("Matrix after Right Rotation:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
