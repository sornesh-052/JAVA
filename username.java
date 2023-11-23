import java.util.*;
public class username {
    String a,b;
    void get(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a username1 : ");
        a=s.nextLine();
        System.out.println("enter a username2 : ");
        b=s.nextLine();

        if(a.equals(b)){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }}

    public static void main(String[] args) {
        username u=new username();
        u.get();
    }

}
