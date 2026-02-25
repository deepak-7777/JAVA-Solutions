package PatternQuestion;

public class TriangularProgram {
    public static void main(String[] args) {


//            for(int i = 1; i <= n; i++) {
//                for(int k = 1; k <= n-i; k++ ) {
//                    System.out.print(" ");
//                }
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print(i + " ");
//                    }
//                System.out.println();
//            }


        int n = 5;
        for(int i = n; i >= 1; i--) {
            for(int k = 1; k <= n-i; k++ ) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

