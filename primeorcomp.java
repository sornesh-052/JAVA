 import java.util.*;
public class primeorcomp
{
public static void main(String args[])
  {
   int i,b,p=0,c=0;
   int a[]=new int[10];
   Scanner s=new Scanner(System.in);
   System.out.println("enter number of elements:");
   b=s.nextInt();
   for(i=0;i<b;i++)
     {  
       
       System.out.println("enter numbers:");
       a[i]=s.nextInt();
      }
 for(i=0;i<b;i++)
{
   if(a[i]%2==0||a[i]%3==0||a[i]%5==0)
    {
      System.out.println("composite numbers:"+a[i]);
     c=c+1;
    }
  else
   {
   System.out.println("prime numbers:"+a[i]);
   p=p+1;
   }
}
System.out.println(""+c);
System.out.println(""+p);
}
}
