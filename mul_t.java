import java.util.*;
class mul_t{
public static void main(String[] args){
int n,i,m;
Scanner s=new Scanner(System.in);
System.out.println("enter table no:");
n=s.nextInt();
for(i=1;i<=5;i++){
m=n*i;
System.out.print(""+n);
System.out.print(" * "+i);
System.out.print(" = "+m);
System.out.println("");
}
}}