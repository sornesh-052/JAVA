import java.util.*;
public class uclc{
    public static void main(String[] args){
        char n;
        int uc_count=0,lc_count=0,num_count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter * to end ");
        do{
            n=s.next().charAt(0);
            if(Character.isUpperCase(n)){
                uc_count++;

            }
            else if(Character.isLowerCase(n)){
                lc_count++;
            }
            else if(Character.isDigit(n)){
                num_count++;
            }
        }while(n!='*');
        System.out.println("lower = "+lc_count);
        System.out.println("upper = "+uc_count);
        System.out.println("digit = "+num_count);


    }
}
