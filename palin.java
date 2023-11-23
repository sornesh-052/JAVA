import java.util.*;
public class palin
{
    public static void main(String args[])
    {
        int a;
        Scanner t=new Scanner(System.in);
        Scanner u=new Scanner(System.in);
        System.out.println("1.String palindrome");
        System.out.println("2.Number palindrome");
        System.out.println("enter choice:");
        a=t.nextInt();
        switch(a)

        {
            case 1:
                String s;
                int i,len;
                String rev="";
                System.out.println("enter a string : ");

                s=u.nextLine();
                char c[]=s.toCharArray();
                len=s.length();

                for(i=len-1;i>=0;i--){
                    rev=rev+c[i];
                }
                if(s.equals(rev)){
                    System.out.println("palindrome");
                }
                else{
                    System.out.println("not palindrome");
                }
                break;

            case 2:
                int p,rem,temp,sum=0;


                System.out.println("enter number:");
                p=t.nextInt();
                temp=p;
                while(p>0)
                {
                    rem=p%10;
                    sum=(sum*10)+rem;
                    p=p/10;
                }
                if(sum==temp){
                    System.out.println("palindrome");
                }
                else{
                    System.out.println("not palindrome");}
        }
    }
}