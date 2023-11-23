import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        int n,t,r,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        t=n;
        while(t>0){
            r=t%10;
            sum=sum+r*r*r;
            t=t/10;
        }
        if(sum==n){
            System.out.println("armstrong ");
        }
        else{
            System.out.println(" not armstrong");
        }
    }
}
