import java.util.*;
class dollar{
public static void main(String args[]){
int i,j,rows;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
rows = sc.nextInt();
for(i=1;i<=rows;i++)
{for(j=1;j<=rows;j++){
if(i>1 && i < rows && j > 1 && j < rows) {
             System.out.println("  ");
            }
            else {
        System.out.println("* ");
            }

System.out.println("");}
}
}
}
