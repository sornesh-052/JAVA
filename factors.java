import java.util.*;
public class factors {
    public static void main(String[] args) {
        int a,f=0,i;
        System.out.println("enter number ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        for (i=1;i<=a;i++) {
		if(a%i==0){
            		f++;
}
        }
        System.out.println("no of factors = "+f);
    }
}