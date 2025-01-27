
public class SquarePattern {

    // 4444
    // 4444
    // 4444
    // 4444

    public static void printPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    // ****
    // ****
    // ****
    // ****

    public static void printPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // 1234
    // 1234
    // 1234
    // 1234

    public static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    /*
     * 1111
     * 2222
     * 3333
     * 4444
     */
    public static void printPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        printPattern1(7);
        printPattern2(7);
        printPattern3(7);
        printPattern4(7);
    }

}
