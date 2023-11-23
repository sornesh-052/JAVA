import java.util.*;
public class simpleinterset {
    public static void main(String[] args) {
        int p,y,roi;
        char c;
        System.out.println("enter the price amount ");
        Scanner s=new Scanner(System.in);
        p=s.nextInt();
        System.out.println("enter no of yaers ");
        y=s.nextInt();
        System.out.println("are u senior citizien (s/n) ");
        c=s.next().charAt(0);
        if(c=='s'||c=='N'){
            roi=p*y*12/100;
            System.out.println("the rate of interset = "+roi);
        } else if (c=='n'||c=='N') {
            roi=p*y*10/100;
            System.out.println("the rate of interset = "+roi);
        }
        else {
            System.out.println("invalid input");
        }


    }
}
