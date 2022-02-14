package tigbur0902;

public class S6 {
    public static void triangle(char ch, int k) {
        for (int i = 1; i <= k; i+=2) {
            for (int j = 0; j < (k - i) / 2; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            for (int j = 0; j < (k - i) / 2; j++) {
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle('\u20AA', 15);
    }
}
