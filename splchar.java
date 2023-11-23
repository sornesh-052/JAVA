import java.util.*;
public class splchar {
    public static void main(String[] args) {
        String s;
        int count=0;
        Scanner a=new Scanner(System.in);
        System.out.println("enter elements ");
        s=a.nextLine();
        for(char c:s.toCharArray()){
        if (Character.isDigit(c)||Character.isLetter(c)) {
            continue;
        }
        else if(Character.isWhitespace(c)){
            continue;
            }
        else{
            System.out.println(" "+c);
            count++;
        }
        }
        System.out.println(count);
    }
}
