import java.util.*;
public class dec_bin{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int num,i;
int[] a=new int[10];
System.out.println("enter a number : ");
num=s.nextInt();
for(i=0;num>0;i++){
a[i]=num%2;
num=num/2;
}
System.out.println("binary number......");
for(i=i-1;i>=0;i--){
System.out.println(a[i]);
}
}
}





