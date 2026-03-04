package InClass;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;   // Add remainder at beginning
            num = num / 2;
        }
        System.out.println("Binary value: " + binary);
    }
}





//import java.util.Scanner;
//
//public class DecimalToBinary {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a decimal number: ");
//        int num = sc.nextInt();
//
//        String binary = Integer.toBinaryString(num);
//
//        System.out.println("Binary value: " + binary);
//    }
//}