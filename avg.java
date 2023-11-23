import java.util.*;
public class avg{
    public static void main(String[] args){
        float n,pos_sum=0,pos_count=0,pos_avg,neg_sum=0,neg_count=0,neg_avg;
        Scanner s=new Scanner(System.in);
        System.out.println("enter -1 to end ");
        do{
            n=s.nextFloat();
            if(n>0){
                pos_sum+=n;
                pos_count++;

            }
            else{
                neg_sum+=n;
                neg_count++;
            }
        }while(n!=-1);
        pos_avg=pos_sum/pos_count;
        neg_avg=neg_sum/neg_count;
        System.out.println("pos sum = "+pos_sum);
        System.out.println("pos count = "+pos_count);
        System.out.println("pos avg = "+pos_avg);
        System.out.println("neg sum = "+neg_sum);
        System.out.println("neg count = "+neg_count);
        System.out.println("neg avg = "+neg_avg);
    }
}