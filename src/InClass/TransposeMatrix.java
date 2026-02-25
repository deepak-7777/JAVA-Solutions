package InClass;

public class TransposeMatrix {
    public static void main(String[] args) {

        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int b[][] = new int[3][3];

        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}




//import java.util.Scanner;                        /// IN THIS PROGRAM USER GIVE THE VALUE
//
//public class TransposeMatrix {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a[][] = new int[3][3];
//        int b[][] = new int[3][3];
//
//        System.out.println("Enter elements of 3x3 matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                b[i][j] = a[j][i];
//            }
//        }
//        System.out.println("\nOriginal Matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("\nTranspose Matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}




//public class TransposeMatrix {                        ///   WITHOUT USING ANOTHER MATRIX
//    public static void main(String[] args) {
//
//        int a[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        for (int i = 0; i < 3; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                int temp = a[i][j];
//                a[i][j] = a[j][i];
//                a[j][i] = temp;
//            }
//        }
//        System.out.println("Transpose Matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
