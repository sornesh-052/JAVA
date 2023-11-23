import java.util.*;
public class uclc{
    public static void main(String[] args){
        String n,uc_count=0,lc_count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter -1 to end ");
        do{
            n=s.nextLine();
            if(n.isLowercase()){
               lc_count++;

            }
            else if(n.isUppercase){
               uc_count++;
            }
        }while(n!="*");
        System.out.println("lower = "+lc_count);
        System.out.println("upper = "+uc_count);
        System.out.println("pos avg = ");
        
    }
}
