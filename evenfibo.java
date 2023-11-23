import java.util.*;
public class evenfibo {
    public static void main(String[] args) {
        int a,f1=0,f2=1,f3,i,sum=0;
        System.out.println("enter number ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        for (i=0;i<=a;i++){
		if(i%2==0){
			sum+=f1;
		}
		f3=f1+f2 ;
            	f1=f2 ;
            	f2=f3 ;


	
    }
System.out.println (" "+sum);

}}