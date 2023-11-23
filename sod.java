import java.util.*;
public class sod{
public static void main(String[] args){
int n,a,rem,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter no of elements  ");
n=s.nextInt();
System.out.println("enter value  ");
a=s.nextInt();
while(a!=0){
rem=a%10;
sum+=rem;
a=a/10;
}
System.out.println("sum = "+sum);
}}

