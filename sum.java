public class sum {
    public int a,sum=0,i;
    void get(int a)
    {
        for(i=0;i<=a;i++)
        {
            sum=sum+i;
        }
    }
}
class factorials extends sum
{
    private int fact=1;

    void get(int a)
    {
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        super.get(a);
    }
    void display()
    {
        System.out.println("sum of Series"+sum);
        System.out.println("factorial"+fact);
    }

    public static void main(String[] args) {

        factorials s=new factorials();
        s.get(5);
        s.display();
    }

}


