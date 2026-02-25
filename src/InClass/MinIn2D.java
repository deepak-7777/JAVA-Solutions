package InClass;

public class MinIn2D {
    public static void main(String[] args) {

        int a[][] = {
                {12, 45, 7},
                {34, 89, 23},
                {56, 10, 90}
        };
        int min = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Smallest element = " + min);
    }
}
