import java.util.*;
public class voting {
    public static void main(String[] args) {
        int age;
        System.out.println("enter a age ");
        Scanner s= new Scanner(System.in);
        age=s.nextInt();
        if(age>=18){
            System.out.println("you can vote");
        }
        else{
            int diff=18-age;
            System.out.println("you can vote after "+diff+" years");
        }
    }
}
