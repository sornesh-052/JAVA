import java.util.*;
class pow_3{
public static void main(String[] args){
int i,n,s=0;
Scanner l=new Scanner(System.in);
System.out.println("Enter a number:");
n=l.nextInt();
for(i=1;i<n;i++){
s=i*i*i;
if(s==n){
System.out.println("True");}
}}}