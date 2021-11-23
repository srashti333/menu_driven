package menu;
import java.util.Scanner;
import java.lang.System;
public class Test {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        Menu o =new Menu();
        int a;
        a = s.nextInt();
        int b;
        b = s.nextInt();
        if( b==1){
            o.fact(a);
        }
        else if(b==2){
            o.fabbo(a);
        }
        else if(b==3){
            o.prime(a);
        }
        else System.exit(4);
    }
}
