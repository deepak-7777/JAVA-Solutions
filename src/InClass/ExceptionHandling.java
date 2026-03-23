package InClass;

//public class ExceptionHandling {
//    public static void main (String[] args) {
//        int a = 10;
//        int b = 5;
//        int c = 5;
//         try {
//             int d = a / (b-c);
//         }
//         catch (ArithmeticException e) {
//             System.out.println("divide by zero Error");
//         }
//         finally {
//             int y = a / ( b + c);
//             System.out.println(y);
//         }
//    }
//}



//public class ExceptionHandling {
//    public static void main (String[] args) {
//        int a = 10;
//        int b = 5;
//        int c = 5;
//            int d = a / (b-c);
//            System.out.println(d);
//        }
//    }




public class ExceptionHandling {
    public static void main(String[] args) {
        int a[] = {5, 10};
        int b = 5;

        try {
            int c = a[2] / (a[0] - b);
            System.out.println("Answer: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound error");
        }

    }
}
