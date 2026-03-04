package InClass;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        int[] count = new int[26];   // for a-z

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}



//import java.util.Scanner;
//
//public class AnagramCheck {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first string: ");
//        String str1 = sc.nextLine().toLowerCase();
//
//        System.out.print("Enter second string: ");
//        String str2 = sc.nextLine().toLowerCase();
//
//        if (str1.length() != str2.length()) {
//            System.out.println("Not Anagram");
//            return;
//        }
//
//        for (int i = 0; i < str1.length(); i++) {
//
//            char ch = str1.charAt(i);
//
//            int index = str2.indexOf(ch);
//
//            if (index == -1) {
//                System.out.println("Not Anagram");
//                return;
//            }
//
//            // remove matched character
//            str2 = str2.substring(0, index) + str2.substring(index + 1);
//        }
//
//        System.out.println("Anagram");
//    }
//}