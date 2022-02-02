package שיעור;

import java.util.Scanner;

public class ex5 {
    static int winh = 0, winhk = 0, h, hk;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        part();
        System.out.println("The winner reached the height of "+winh+" meters and used "+winhk+" hooks");

    }

    public static void part() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Please enter the height that you reached and the amount of hooks that you used ");
            h = input.nextInt();
            hk = input.nextInt();
            Whatahell();}
    }
    public static void Whatahell (){
        if (h>winh){
            winh=h;
            winhk=hk;}
        else if (winh==h){
            if (winhk>hk)
                winhk=hk;
        }

    }
}