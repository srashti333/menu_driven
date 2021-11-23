package menu;

public class Menu {
    void fact(int a){
        long f= 1;
        for (int i = 2; i <= a; i++) {
            f = f* i;
        }
        System.out.println(f);
    }
    void fabbo(int a){
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);
        for(i=2;i<a;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    void prime(int a){
        for(int i=2;i<=(a/2);++i){
            if(a%i==0){
                System.out.println("Is Prime");
            }
            else
                System.out.println("Not Prime");
        }
    }
}
