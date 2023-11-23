import java.util.*;
public class composite {
    public static void main(String[] args) {
        int n,m;
        Scanner s=new Scanner(System.in);
        System.out.println("enter starting number  ");
        n=s.nextInt();
        System.out.println("enter ending number  ");
        m=s.nextInt();
        for(int i=n+1;i<m;i++){
            if(i%2==0||i%3==0||i%5==0){
                System.out.println (" "+i);
            }
        }

    }
}