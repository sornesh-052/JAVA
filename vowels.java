import java.util.*;
public class vowels {
    public static void main(String[] args) {
        String s;
        int count=0;
        Scanner a=new Scanner(System.in);
        System.out.println("enter elements ");
        s=a.nextLine().toLowerCase();
        for(char c:s.toCharArray()){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
		count++;
}}
System.out.println("no of vowels = "+count);
    }
}
