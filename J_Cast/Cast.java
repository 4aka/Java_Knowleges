package J_Cast;

public class Cast {

    public static void main(String[] args) {

        byte b = 10;
        int i;

        i = b * b;
        System.out.println(i);
        // ���� ���������� �� ���

        // ���������� ���������� ����� CAST

        b = (byte) (b * b);
        System.out.println(b);

		char ch1 = 't';
        char ch2 = 'b';

        int a = ch1 + ch2;
        System.out.println(a);

        char ch = (char) (ch1 + ch2);
        System.out.println(ch);

		int v = 10;
        double d = 10.10;
        byte bt = '8'; // = 56
        String s = "eqw123";

        String str = (String) (v + d + bt + s);
        System.out.println(str);
        System.out.println(bt);
        // 10 + 10.10 + 56 + eqw123 = 76.1eqw123 ���������� "0"

		// ���������� ����� � ������ �� �������
        i = 1;
        System.out.println(i + (double) i / 3);
    }
}
