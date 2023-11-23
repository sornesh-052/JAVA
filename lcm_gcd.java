import java.util.*;
public class lcm_gcd{
public static void main(String[] args){
int n1,n2,gcd=1;
Scanner s=new Scanner(System.in);
System.out.println("enter number 1 ");
n1=s.nextInt();
System.out.println("enter number  ");
n2=s.nextInt();
for(int i=1;i<=n1&&i<=n2;i++){
if(n1%i==0&&n2%i==0){
gcd=i;
}
}
int lcm=(n1*n2)/gcd;
System.out.println("lcm = "+lcm);
System.out.println("gcd = "+gcd);
}
}

