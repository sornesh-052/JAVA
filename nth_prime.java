import java.util.*;
public class nth_prime{
    public static void main(String[] args){
        int num,n,i,f=0;
        int a[]=new int[50];
        Scanner s=new Scanner(System.in);

        for(i=1;i<=50;i++){
            if(i==2||i==3||i==5){
                a[i]=i;
            }
            else if(i==1||i%2==0||i%3==0||i%5==0){
                continue;
            }
            else{
                a[i]=i;
            }
            System.out.println(""+a[i]);
        }
        System.out.println(a[7]);
for(i=3;i<=5;i++){
        System.out.println(""+a[i]);

        }}
}