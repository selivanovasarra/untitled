package Hw2401;

import java.util.Random;

public class Task4 {
    public static int shift(int d){
        int c=d%10;
        d=d/10;

        int a=10;
        while (a<=d){
            a=a*10;
        }
        return d+c*a;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(45, 140);
            System.out.println(a + " -> " + shift(a));
        }
    }
}
