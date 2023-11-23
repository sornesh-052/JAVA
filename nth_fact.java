import java.util.*;
public class nth_fact{
    public static void main(String[] args){
        int num,n,i,f=0,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number : ");
        num=s.nextInt();
        for(i=1;i<=num;i++){
            if(num%i==0){
                f++;
               
            }
        }
System.out.println("total factors = "+f);


        System.out.println("enter nth : ");
        n=s.nextInt();
        for(i=1;i<=num;i++){
            if(num%i==0){
                c++;
if(c==n){
System.out.println("factor = "+i);
break;

}
               
            }
        }
        
        

    }
}