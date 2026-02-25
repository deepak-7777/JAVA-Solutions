package PatternQuestion;

public class Pattern {

    // 1. Square Hollow
    static void squareHollow(int n) {
        System.out.println("\nSquare Hollow Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 2. Number Triangular
    static void numberTriangular(int n) {
        System.out.println("\nNumber Triangular");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    // 3. Number Increasing Pyramid
    static void numberIncreasingPyramid(int n) {
        System.out.println("\nNumber Increasing Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // 4. Reverse
    static void numberIncreasingReversePyramid(int n) {
        System.out.println("\nNumber Increasing Reverse Pyramid");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // 5. Number Changing Pyramid
    static void numberChangingPyramid(int n) {
        System.out.println("\nNumber Changing Pyramid");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }

    // 6. Zero One Triangle
    static void zeroOneTriangle(int n) {
        System.out.println("\nZero One Triangle");
        for (int i = 1; i <= n; i++) {
            int val = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val;
            }
            System.out.println();
        }
    }

    // 7. Palindrome Triangular
    static void palindromeTriangular(int n) {
        System.out.println("\nPalindrome Triangular");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            for (int j = 2; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    // 8. Rhombus
    static void rhombusPattern(int n) {
        System.out.println("\nRhombus Pattern");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 9. Diamond
    static void diamondPattern(int n) {
        System.out.println("\nDiamond Pattern");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 10. Butterfly
    static void butterflyPattern(int n) {
        System.out.println("\nButterfly Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 11. Square Fill
    static void squareFill(int n) {
        System.out.println("\nSquare Fill Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 12. Right Half Pyramid
    static void rightHalfPyramid(int n) {
        System.out.println("\nRight Half Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 13. Reverse Right Half
    static void reverseRightHalfPyramid(int n) {
        System.out.println("\nReverse Right Half Pyramid");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 14. Left Half
    static void leftHalfPyramid(int n) {
        System.out.println("\nLeft Half Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 15. Reverse Left
    static void reverseLeftHalfPyramid(int n) {
        System.out.println("\nReverse Left Half Pyramid");
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 16. K Pattern
    static void kPattern(int n) {
        System.out.println("\nK Pattern");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 17. Triangle Star
    static void triangleStarPattern(int n) {
        System.out.println("\nTriangle Star Pattern");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 18. Reverse Number Triangle
    static void reverseNumberTriangle(int n) {
        System.out.println("\nReverse Number Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // 19. Mirror Image Triangle
    static void mirrorImageTriangle(int n) {
        System.out.println("\nMirror Image Triangle");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }

    // 20. Hollow Triangle
    static void hollowTriangle(int n) {
        System.out.println("\nHollow Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 21. Hollow Reverse Triangle
    static void hollowReverseTriangle(int n) {
        System.out.println("\nHollow Reverse Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 22. Hollow Diamond
    static void hollowDiamond(int n) {
        System.out.println("\nHollow Diamond");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 23. Hollow Hourglass
    static void hollowHourglass(int n) {
        System.out.println("\nHollow Hourglass");
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 24. Pascal Triangle
    static void pascalTriangle(int n) {
        System.out.println("\nPascal Triangle");
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // 25. Right Pascal
    static void rightPascalTriangle(int n) {
        System.out.println("\nRight Pascal Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 5;

        squareHollow(n);
        numberTriangular(n);
        numberIncreasingPyramid(n);
        numberIncreasingReversePyramid(n);
        numberChangingPyramid(n);
        zeroOneTriangle(n);
        palindromeTriangular(n);
        rhombusPattern(n);
        diamondPattern(n);
        butterflyPattern(n);
        squareFill(n);
        rightHalfPyramid(n);
        reverseRightHalfPyramid(n);
        leftHalfPyramid(n);
        reverseLeftHalfPyramid(n);
        kPattern(n);
        triangleStarPattern(n);
        reverseNumberTriangle(n);
        mirrorImageTriangle(n);
        hollowTriangle(n);
        hollowReverseTriangle(n);
        hollowDiamond(n);
        hollowHourglass(n);
        pascalTriangle(n);
        rightPascalTriangle(n);
    }

}

