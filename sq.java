import java.util.*;
class sq{
public static void main(String[] args){
int n,i,m;
Scanner s=new Scanner(System.in);
System.out.println("enter no:");
n=s.nextInt();
for(i=1;i<=n;i++){
m=i*i;
if(m==n){
System.out.println(" "+i);
System.out.println(" , -"+i);
}}
}}