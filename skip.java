import java.util.*;
public class skip {
    public static void main(String[] args) {
        int n,m,c;
	Scanner s=new Scanner(System.in);
	System.out.println("enter starting number  ");
	n=s.nextInt();
	System.out.println("enter ending number  ");
	m=s.nextInt();
	System.out.println("enter number to skip  ");
	c=s.nextInt();
        for(int i=n+1;i<m-1;i++){
            i=i+c;
            System.out.println (" "+i);
        }
    }
}