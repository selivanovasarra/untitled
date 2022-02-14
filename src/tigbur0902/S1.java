package tigbur0902;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        square(s.nextInt());
    }

    public static void square(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
