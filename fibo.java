import java.util.*;
public class fibo {
    public static void main(String[] args) {
        int a,f1=0,f2=1,f3,i;
        System.out.println("enter number ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println(f1);
        System.out.println (f2) ;
        for (i=0;i<a;i++){
            f3=f1+f2 ;
            f1=f2 ;
            f2=f3 ;
    System.out.println (f3);}

}}