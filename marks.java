import java.util.*;
public class marks {
    public double m1,m2,m3,m4;
    public int a,b,c,d;
    void get(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter mark1 = ");
        a=s.nextInt();
        System.out.println("enter mark2 = ");
        b=s.nextInt();
        System.out.println("enter mark3 = ");
        c=s.nextInt();
        System.out.println("enter mark4 = ");
        d=s.nextInt();
       m1=a;
       m2=b;
       m3=c;
       m4=d;
    }
}
class calculation extends marks{
    public double total;
    public double agg;
    void cal(){
        total=m1+m2+m3+m4;
        agg=total/4;
    }
}
class grade extends calculation{
    void result() {
        if (agg >= 75) {
            System.out.println("distinction");
        }
        else if(agg>=60 && agg<75){
            System.out.println("first division");
        }
        else if(agg>=50 && agg<60){
            System.out.println("second division");
        }
        else if(agg>=40&&agg<50){
            System.out.println("third division");
        }
        else{
            System.out.println("fail");
        }
    }
    void display(){
        System.out.println("total "+total);
        System.out.println("agg "+agg);


    }
    public static void main(String[] args) {
        grade g=new grade();
        g.get();
        g.cal();
        g.display();
        g.result();
    }
}


