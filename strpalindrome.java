import java.util.Scanner;
public class strpalindrome {
    public static void main(String[] args) {
        String s;
        int i,len=0;
        String rev="";
        System.out.println("enter a string : ");
        Scanner a = new Scanner(System.in);
        s=a.nextLine();
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

    }
}
