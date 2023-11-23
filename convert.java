import java.util.*;

public class convert
{
 public static void main(String args[])
{
 int n,i;
int a[]=new int[10];
int b[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("enter number:");
n=s.nextInt();
for(i=0;n>0;i++){

a[i]=n%2;
n=n/2;
}
System.out.println("bin = ");
for(i=i-1;i>=0;i--){
System.out.println(""+a[i]);
}
for(i=0;n>0;i++){

b[i]=n%8;
n=n/8;
}
System.out.println("oct = ");
for(i=i-1;i>=0;i--){
System.out.println(""+b[i]);
}

}}