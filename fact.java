import java.util.*;
public class fact {
    public static void main(String[] args) {
        int a, fact = 1, i;
        System.out.println("enter number ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}