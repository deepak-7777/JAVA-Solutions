package MCQSet;

public class MCQ1 {

    // Q1
    static void q1() {
        int k = 0;
        boolean istrue = false;
        int p = 0;
        System.out.println("Q1 Output: " + k + " " + istrue + " " + p);
    }

    // Q2
    static void q2() {
        System.out.println("Q2: Compile Error because 'do' is keyword");
    }

    // Q3
    static void q3() {
        int i = 010; // octal = 8
        int j = 07;  // octal = 7
        System.out.println("Q3 Output: " + i + " " + j);
    }

    // Q4
    static void q4() {
        byte b = 6;
        b += 8;
        System.out.println("Q4 After b+=8: " + b);
        System.out.println("b = b+7 gives compile error");
    }

    // Q5
    static void q5() {
        String value = "abc";
        changeValue(value);
        System.out.println("Q5 Output: " + value);
    }

    static void changeValue(String a) {
        a = "xyz";
    }

    // Q6
    static void q6() {
        System.out.println("Q6 Output: Hello Test");
    }

    // Q7
    static void q7() {
        int x = 5;
        x *= 3 + 7;
        System.out.println("Q7 Output: " + x);
    }

    // Q8
    static void q8() {
        int a = 5, b = 6, c = 7;
        System.out.println("Q8: Value is " + b + c);
        System.out.println(a + b + c);
        System.out.println("String " + (b + c));
    }

    // Q9
    static void q9() {
        System.out.println("Q9: Byte range = -128 to 127");
    }

    // Q10
    static void q10() {
        System.out.println("Q10: ArrayIndexOutOfBoundsException");
    }

    // Q11
    static void q11() {
        System.out.println("Q11 Valid: variable2, _whatavariable, _3_, $anothervar");
    }

    // Q12
    static void q12() {
        int i = 0;
        System.out.println("Q12 Output: " + i);
    }

    // Q13
    static void q13() {
        int anar[] = {1, 2, 3};
        System.out.println("Q13 Output: " + anar[1]);
    }

    // Q14
    static void q14() {
        int anar[] = new int[5];
        System.out.println("Q14 Output: " + anar[0]);
    }

    // Q15
    static void q15() {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            default:
                System.out.println("default");
        }
    }

    // Q16
    static void q16() {
        int i = 9;
        switch (i) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("zero");
        }
    }

    // Q17
    static void q17() {
        System.out.println("Q17 Correct: Statement 2 and 3");
    }

    // Q18
    static void q18() {
        String s1 = "Hello";
        String s2 = "there";
        String s3 = s1 + s2;
        System.out.println("Q18 Output: " + s3);
    }

    // Q19
    static void q19() {
        System.out.println("Q19 Output: " + (4 | 3));
    }

    // Q20
    static void q20() {
        System.out.println("Q20: public modifier valid");
    }

    // Q21
    static void q21() {
        System.out.println("Q21: main signature wrong → runtime error");
    }

    // Q22
    static void q22() {
        System.out.println("Q22: Runtime ArrayIndexOutOfBoundsException");
    }

    // Q23
    static void q23() {
        int j = 0;
        boolean b = false;
        System.out.println("Q23 Output: " + j + " " + b);
    }

    // Q24
    static void q24() {
        int z = 015;
        System.out.println("Q24 Output: " + z);
    }

    // Q25
    static void q25() {
        System.out.println("Q25 Keywords: double, instanceof");
    }

    // Q26
    static void q26() {
        int i = 1, j = 0;
        j = i << j;
        System.out.println("Q26 Output: " + j);
    }

    // Q27
    static void q27() {
        String s = "Hello";
        int i = 10;
        s += i;
        System.out.println("Q27 Output: " + s);
    }

    // Q28
    static void q28() {
        System.out.println("Q28:");
        System.out.println(1 + 1);
        int i = 2 + '2';
        System.out.println(i);
        String s = "on" + 'e';
        System.out.println(s);
    }

    // Q29
    static void q29() {
        System.out.println("Q29: Byte range −128 to 127");
    }

    // Q30
    static void q30() {
        char c = '1';
        System.out.println("Q30:");
        System.out.println(c >> 1);
        int i = 1;
        System.out.println(i << 1);
    }

    // MAIN
    public static void main(String[] args) {

        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
        q11();
        q12();
        q13();
        q14();
        q15();
        q16();
        q17();
        q18();
        q19();
        q20();
        q21();
        q22();
        q23();
        q24();
        q25();
        q26();
        q27();
        q28();
        q29();
        q30();
    }
}
