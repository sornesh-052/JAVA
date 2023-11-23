import java.util.*;
public class merge_array{
    public static void main(String[] args) {
        int a[]=new int[20];
        int b[]=new int[20];
        
        
        int i=0,one,two;
        Scanner s=new Scanner(System.in);
        System.out.println("no of elem in 1 array");
        one=s.nextInt();
        System.out.println("array 1");
        for(i=0;i<one;i++){
            a[i]=s.nextInt();

        }
        System.out.println("no of elem in 2 array");
        two=s.nextInt();
        System.out.println("array 2");
        for(i=0;i<two;i++){
            b[i]=s.nextInt();

        }
        int c[]=new int[20];
        for(int ele:a){
            c[i]=ele;
            i++;
        }
        for(int ele:b){
            c[i]=ele;
            i++;
        }
        System.out.println(Arrays.toString(c));


    }
}
