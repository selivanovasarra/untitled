package tigbur0902;

import java.util.Scanner;

public class S3 {
    public static int update(int num) {
        for (int i = 0; i < 2; i++) {
            int first = num;
            while (first > 9) {
                first /= 10;
            }
            int control = (first + (num % 10)) % 10;
            num = num * 10 + control;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = s.nextInt();
            System.out.println(update(num));
        }
    }
}
