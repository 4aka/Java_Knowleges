package ConsoleProgressVisualization;

public class Main {

    static boolean print = true;
    public static final String path = System.getProperty("user.dir");
    static int errorsCount = 0;

    private static void print(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
            try {
                Thread.sleep(75);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void clean() throws InterruptedException {
        String clean = " \b\b";
        System.out.print(" ");
        for (int i = 0; i < 12; i++) {
            System.out.print(clean);
            Thread.sleep(75);
        }
        System.out.print("\b");
    }

    private static void cursor() {
        Thread thread = new Thread() {
            public void run() {
                while (print) {
                    try {
                        if (print) {
                            System.out.print("|");
                            Thread.sleep(100);
                            System.out.print("\b");
                        }
                        if (print) {
                            System.out.print("/");
                            Thread.sleep(100);
                            System.out.print("\b");
                        }
                        if (print) {
                            System.out.print("-");
                            Thread.sleep(100);
                            System.out.print("\b");
                        }
                        if (print) {
                            System.out.print("\\");
                            Thread.sleep(100);
                            System.out.print("\b");
                        }
                    } catch (InterruptedException e) {
                    }
                }

                interrupt();
            }
        };

        thread.start();
    }

    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Thread.sleep(1000);

        print("Testing: ");
        cursor();

        print = false;

        Thread.sleep(1000);
        clean();
        Thread.sleep(1000);
        print("Total errors: ");
        Thread.sleep(500);
        System.out.println(errorsCount);
        Thread.sleep(500);

        System.out.println("\nPress any key to continue...");
        new ProcessBuilder("cmd", "/c", "pause > null").inheritIO().start().waitFor();

        System.exit(0);
    }
}