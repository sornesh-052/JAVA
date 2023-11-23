import java.util.Scanner;
public class reverse_int {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        int rev=0,temp;
        while(n!=0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println("reverse = "+rev);
    }
}
