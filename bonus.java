import java.util.*;
public class bonus{
    public static void main(String[] args){
        double sal,bon,total;
        String grade;
        Scanner i=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        System.out.println("enter your grade ");
        grade=s.nextLine().toLowerCase();
        System.out.println("enter your salary ");
        sal=i.nextFloat();
        if(sal>0){
            if(grade.equals("a")){
                bon=sal*0.05;
                if(sal<=10000){
                    bon=sal*0.07;
                }
                total=bon+sal;
                System.out.println("bonus = "+bon);
                System.out.println("total = "+total);
            }
            else if(grade.equals("b")){
                bon=sal*0.1;
                if(sal<=10000){
                    bon=sal*0.12;
                }
                total=bon+sal;
                System.out.println("bonus = "+bon);
                System.out.println("total = "+total);
            }
            else{
                System.out.println("invalid input");
            }


        }
        }
}
