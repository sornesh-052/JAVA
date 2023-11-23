import java.util.*;
public class maxormin
{
 public static void main(String args[])
  {
    int a,i,j,min=0,max=0,temp=0,sum=0,d=0;
    int b[]=new int[10];
    Scanner s=new Scanner(System.in);
    System.out.println("enter number:");
    a=s.nextInt();
    for(i=0;i<a;i++)
     {
       System.out.println("elements:");
       b[i]=s.nextInt();
      }

   for(i=0;i<a;i++)
    {
     for(j=i+1;j<a;j++)
  {
   if(b[i]>b[j])
     { 
     temp=b[i];
      b[i]=b[j];
      b[j]=temp; 
      }
         
   }
}
 for(i=0;i<a-1;i++)
  {
   
min=b[0];
max=b[a-1]; 
}

System.out.println("maximum:"+max);
System.out.println("minimum:"+min);
sum=min+max;
d=max-min;
System.out.println("sum:"+sum);
System.out.println("difference:"+d);
 

}
}
