import java.util.*;
public class fact_rec{

    int fact(int n){
        
        if(n==0){
            return 1;
        }
        return (n*fact(n-1));
        }
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number ");
        n=s.nextInt();
        fact_rec f=new fact_rec();
        f.fact(n);

    }
}