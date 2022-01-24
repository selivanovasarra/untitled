package Hw2401;

import java.util.Scanner;

public class Weee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        a=s.nextInt();
        while (a!=999){
            if (zariz(a))
                System.out.println("zariz number");
            a=s.nextInt();
        }
    }

    public static boolean zariz (int a){
        if (a/100>a%100/10 && a%100/10>a%10) return true;
        else return false;
    }
}
