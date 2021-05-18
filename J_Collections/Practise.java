package J_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

// --------------------------------------------------------------------------

public class Practise {
    HashMap<String, Integer> players;

    Practise() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public void getWinner() {
        Iterator<String> strIt = players.keySet().iterator();
        String str, res = "";
        int i = 0;

        while (strIt.hasNext()) {
            str = strIt.next();

            if (players.get(str) > i) {
                i = players.get(str);
                res = str;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Practise game = new Practise();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer("name", points);
            game.addPlayer("name", points);
            game.addPlayer("name", points);
        }
        game.getWinner();
    }
}

// --------------------------------------------------------------------------

class Program3 {
    public void meth2() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        String res = "";

        // way 1
        for (int i = ch.length - 1; i >= 0; i--) {
            res += ch[i];
        }
        System.out.println(res);

        // Way 2
        System.out.println(new StringBuilder(str).reverse());
    }
}

// --------------------------------------------------------------------------

class Program4 {

    public void meth3() {
        Scanner scanner = new Scanner(System.in);
        Integer amount = scanner.nextInt();
        int rem_amt = amount;

        for (int i = 1; i <= 6; i++) {
            int paid = (int) Math.ceil(rem_amt);
            rem_amt = paid;
        }
        System.out.println(rem_amt * 729 / 1000);
    }

    public static void main(String[] args) {
        Program4 p = new Program4();
        p.meth3();
    }
}

// --------------------------------------------------------------------------

class Converter {
    public static String toBinary(int x) {
        String binary = "";

        while (x > 0) {
            binary = (x % 2) + binary;
            x /= 2;
        }
        return binary;
    }
}

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}

// --------------------------------------------------------------------------

abstract class Shape {
    int width;

    abstract void area();
}

class Square extends Shape {
    int x;

    Square(int x) {
        this.x = x;
    }

    public void area() {
        System.out.println(x * x);
    }
}

class Circle extends Shape {
    int y;

    Circle(int y) {
        this.y = y;
    }

    public void area() {
        System.out.println(Math.PI * y * y);
    }
}

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

// --------------------------------------------------------------------------