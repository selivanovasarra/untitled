package tigbur0902;

import java.util.Scanner;

public class S2 {
    public static int minutes (int h, int m) {
        int min = h*60+m;
        return min;
    }
    public static int diff (int h1, int m1, int h2, int m2){
        int d= minutes(h1, m1) - minutes(h2, m2);
        return Math.abs(d);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int max = 0;
        int num = 0;
        for (int i = 0; i < 7; i++) {
            int h1 = s.nextInt(), m1 = s.nextInt(), h2 = s.nextInt(), m2 = s.nextInt();
            int work = diff(h1, m1, h2, m2);
            if (work > max) {
                max = work;
                num = i;
            }
        }
        switch (num) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
