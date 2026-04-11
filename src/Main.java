//public class Main {
//    public static void main(String argv[]) {
//        int[] i = new int[5];
//        System.out.println(i[5]);
//    }
//}




//class Main {
//    public static void main(String[] args) {
//        double d = 9.8;
//        int x = (int)d;
//        System.out.println(x);
//    }
//}



class Main {

    // 1. Prime Number
    static void primeNumber(int n) {
        boolean isPrime = true;

        if (n <= 1) isPrime = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    // 2. Fibonacci Series
    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 3. Armstrong Number
    static void armstrong(int n) {
        int temp = n, sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum += r * r * r;
            n /= 10;
        }

        if (sum == temp)
            System.out.println(temp + " is Armstrong");
        else
            System.out.println(temp + " is Not Armstrong");
    }

    // 4. Reverse String
    static void reverseString(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reverse: " + rev);
    }

    // 5. Palindrome Number
    static void palindromeNumber(int n) {
        int temp = n, rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        if (rev == temp)
            System.out.println(temp + " is Palindrome");
        else
            System.out.println(temp + " is Not Palindrome");
    }

    // 6. Sum of Digits
    static void sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }

    // 7. Reverse String Palindrome
    static void stringPalindrome(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev))
            System.out.println("String is Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // 8. Star Pattern
    static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 9. Factorial
    static void factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }

    // 10. GCD (HCF)
    static void gcd(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }

    // 🔥 MAIN METHOD
    public static void main(String[] args) {

        primeNumber(7);
        fibonacci(6);
        armstrong(153);
        reverseString("Java");
        palindromeNumber(121);
        sumOfDigits(1234);
        stringPalindrome("madam");
        starPattern(4);
        factorial(5);
        gcd(12, 18);
    }
}