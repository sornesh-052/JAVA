import java.util.Scanner;
public class strrev {
    public static void main(String[] args) {
        String s;
        int i,len=0;
        System.out.println("enter a string : ");
        Scanner a = new Scanner(System.in);
        s=a.nextLine();
        len=s.length();
        
        for(i=len-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }

    }
}