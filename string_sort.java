import java.util.Scanner;
public class string_sort
{
    public static void main(String[] args)
    {
        String s;
        char temp;
        int i,len=0;
        String rev="";
        System.out.println("enter a string : ");
        Scanner a = new Scanner(System.in);
        s=a.nextLine();
        char c[]=s.toCharArray();
        len=s.length();
        for(i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if (c[i]>c[j])
                {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for(i=len-1;i>=0;i--){
            System.out.println(c[i]);
        }

    }
}

