import java.util.*;
class rec_pattern{
public static void main(String args[]){
int i,j,rows,col;
String s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
rows = sc.nextInt();
System.out.println("Enter the number of cols");
col = sc.nextInt();
Scanner n = new Scanner(System.in);
System.out.println("Enter symbol");
s = n.nextLine();
for(i=1;i<=rows;i++)
{
for(j=1;j<=col+1;j++)
{
System.out.print(""+s);
}
System.out.println("");
}
}
}
