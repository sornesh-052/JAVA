import java.util.*;
public class largest_no{
public static void main(String[] args){
int a[]=new int[20];
int n,i,j,m,temp=0;
Scanner c=new Scanner(System.in);
System.out.println("enter array size:");
n=c.nextInt();
System.out.println("enter array elements:");

for(i=0;i<n;i++){

a[i]=c.nextInt();
}
System.out.println("enter nth:");
m=c.nextInt();
for(i=0;i<=n;i++)
{
for(j=i+1;j<=n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}}
for(i=0;i<n-1;i++){
System.out.println("nth largest:"+a[m-1]);
break;
}
}
}
