import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int sum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                sum+=i;
            }
        }
        if(number==sum)
        {
            System.out.println("Perfect number");
        }
        else
        {

            System.out.println("Not a perfect number");
        }


    }
}
