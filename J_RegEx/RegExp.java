package J_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    // https://javarush.ru/groups/posts/regulyarnye-vyrazheniya-v-java
    // https://www.javatpoint.com/java-regex
    // https://proglib.io/p/25-java-regex/

    public static void main(String[] args) {
        System.out.println(toJadenCase("sdf sdf sdf f 3r4f34f34f34 fd sdf sdf"));

        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)

        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true

        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true

        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)

        String text = "���� ���� ����";
        Pattern pattern = Pattern.compile("�.+?�");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("������� ���������� " + text.substring(start, end) + " � " + start + " �� " + (end - 1) + " �������");
        }
        System.out.println(matcher.replaceFirst("���"));
        System.out.println(matcher.replaceAll("�����"));
        System.out.println(text);
    }

    public static String toJadenCase(String phrase) {
        Matcher matcher = Pattern.compile("(?:^|\\s)(\\w)").matcher(phrase);
        StringBuilder builder = new StringBuilder(phrase);

        while (matcher.find()) {
            builder.setCharAt(matcher.end() - 1, matcher.group(1).toUpperCase().charAt(0));
        }
        return phrase.length() == 0 ? null : builder.toString();
    }
}

    /*

    . 	 ������������ ���������� �������
    ^regex 	����� ����������� ��������� � ����������� � ������ ������
    regex$ 	����� ����������� ��������� � ����������� � ����� ������
    [abc] 	����� ������ �������, ������������ � ���������� ������
    [abc][vz] 	������� �������� ������� a, b ��� c, ��  �������� �������  v ��� z
    [^ xyz] 	����� ������  ������������� ����� ���������� ��������� � ���������� �������, �� "��������" ������. ������ ������  ������������� ������ �������, ����� x, y ��� z.
    [a-d1-7] 	���������: ������������� ����� ����� a  � d � ������� �� 1 �� 7, �� �� d-1.
    X|Z 	������� X ��� Z
    $ 	����� ������
    ^ 	������ ������
    (re) 	������� ������ �� ���������� ���������,  ��������� ����� ��� �����������
    (?: re) 	��������� ��� (re), �� �� ���������� �����

    * 	���������� ���� ��� ����� ���, ���������� {0,} 	X* �� ������� �� ����� ��� ���������� ���� X, <sbr/>.* ������� ����� ������������������ ��������.
    + 	���������� ���� ��� ��������� ���, ���������� {1,} 	X+  ������� ���� ��� ��������� ���� X
    ? 	�� ����������  ��� ��������� ���� ���,? �������� ����������� ��� {0,1}.
	X? �� ������� �� ����� ����� X ��� ������ ����.
    {X} 	���������� X ��� 	\d{3} ���� ��� �����.
    {X,Y} 	���������� �� ����� X, �� �� ����� Y ��� 	\d{1,4} ��������, ��� \d ������ ����������� ��� ������� ���� ��� � �������� ������
    *?	? ����� �������������� ������ ��� ������� ���������������. �� �������� ����� ���������� ����������. ��� ������������� ���������� ��������� ��� ������ ����������.

    [abc] 	Find one character from the options between the brackets
    [^abc] 	Find one character NOT between the brackets
    [0-9] 	Find one character from the range 0 to 9

	[abc]	a, b, or c (simple class)
	[^abc]	Any character except a, b, or c (negation)
	[a-zA-Z]	a through z or A through Z, inclusive (range)
	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
	[a-z&&[def]]	d, e, or f (intersection)
	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)

    Metacharacters are characters with a special meaning:

    | 	Find a match for any one of the patterns separated by | as in: cat|dog|fish
    . 	Find just one instance of any character
    ^ 	Finds a match as the beginning of a string as in: ^Hello
    $ 	Finds a match at the end of the string as in: World$
    \d 	Find a digit
    \s 	Find a whitespace character
    \b 	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
    \ u	Find the Unicode character specified by the hexadecimal number xxxx

    \d	Any digits, short of [0-9]
    \D	Any non-digit, short for [^0-9]
    \s	Any whitespace character, short for [\t\n\x0B\f\r]
    \S	Any non-whitespace character, short for [^\s]
    \w	Any word character, short for [a-zA-Z_0-9]
    \W	Any non-word character, short for [^\w]
    \b	A word boundary
    \B	A non word boundary

    Quantifiers define quantities:

    n+ 	Matches any string that contains at least one n
    n* 	Matches any string that contains zero or more occurrences of n
    n? 	Matches any string that contains zero or one occurrences of n
    n{x} 	Matches any string that contains a sequence of X n's
    n{x,y} 	Matches any string that contains a sequence of X to Y n's
    n{x,} 	Matches any string that contains a sequence of at least X n's

    Note:
      If your expression needs to search for one of the special characters you can use a backslash ( \ )
        to escape them. In Java, backslashes in strings need to be escaped themselves,
        so two backslashes are needed to escape special characters.
        For example, to search for one or more question marks you can use the following expression: "\\?"
    */