import java.util.*;
public class sq_array{
    public static void main(String[] args){
int start,end,i;
int a[]=new int[20];
Scanner s=new Scanner(System.in);
        System.out.println("enter starting number : ");
        start=s.nextInt();
System.out.println("enter ending number : ");
        end=s.nextInt();
for(i=start;i<=end;i++){
int sq=i*i;
System.out.println("["+i+","+sq+"]");
}
        }
}