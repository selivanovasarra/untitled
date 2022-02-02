package שיעור;

import java.util.Scanner;

public class ex3 {
    static int n=0;
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            n = random();
            System.out.println(n);
            int an=game(n);
            System.out.println("You guessed a number (or +-5):"+an);
        }
    }
    public static int random(){
        int num=(int)(Math.random()*(100-1+1)+1);
        return num;
    }
    public static int game(int n){
        int g=0;
        int amount=0;
        for (int i=0; i<10; i++){
            System.out.println("Your guess");
            g= input.nextInt();
            if (((n-5)<=g && g<=n)||(g>=n && g<=(n+5)))
                amount++;}
        return amount;}
}

