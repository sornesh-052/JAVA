import java.util.*;
public class sumofseries {
    public static void main(String[] args) {
        int a,sum=0, i;
        System.out.println("enter number ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        for (i = 1; i <= a; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}