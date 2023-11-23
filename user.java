import java.util.*;
public class user{
public static void main(String[] args){
int tot,teach,non_teach,student;
Scanner s=new Scanner(System.in);
System.out.println("enter total no of user : ");
tot=s.nextInt();
System.out.println("enter no of staff user : ");
teach=s.nextInt();
non_teach=teach/3;
student=tot-teach-non_teach;
System.out.println("student user = "+student);
}
}

