package InClass;

public class Rotate1DRight {
        public static void main(String[] args) {

            int a[] = {1, 2, 3, 4, 5};

            int n = a.length;
            int last = a[n - 1];
            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }

            a[0] = last;

            System.out.println("Array after Right Rotation:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
}
