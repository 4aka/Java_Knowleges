package J_BitOperation;

public class Exercise {

    public static void main(String[] args) {

        // apper case to lower case
        char ch;

        for (int i = 0; i < 10; i++) {
            // 'a' = 97. 1100 001
            // 'A' = 65. 1000 001

            // 'b' = 98. 1100 010
            // 'B' = 66. 1000 010
            ch = (char) ('a' + i);
            // cast to char -> ('a' = 97) + i.

            // = 'a' + 0 = a
            // = 'a' + 1 = b
            // ...

            System.out.println(ch);
            // Result a, b, c, d, e, f, g, h, i, j

            // 65503 = 1111111111011111
            ch = (char) ((int) ch & 65503);
            // cast to char = cast to int ( 97 & 65503 )
            // 1100 001 & 1111 1111 1101 1111

            System.out.println(ch + " ");
            // Result aA, bB, cC, dD, eE, fF, gG, hH, iI, jJ
        }
    }
}