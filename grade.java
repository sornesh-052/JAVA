import java.util.*;
public class grade{
public static void main(String[] args){
int m1,m2,m3,m4,total;
float agg;
Scanner s=new Scanner(System.in);
System.out.println("enter mark of sub 1 = ");
m1=s.nextInt();
System.out.println("enter mark of sub 2 = ");
m2=s.nextInt();
System.out.println("enter mark of sub 3 = ");
m3=s.nextInt();
System.out.println("enter mark of sub 4 = ");
m4=s.nextInt();
total=m1+m2+m3+m4;
System.out.println("total = "+total);
agg=total/4;
if(agg>=75.0){
System.out.println("Distinction");
}
else if(agg>=60.0||agg<75.0){
System.out.println("First Division");
}
else if(agg>=50.0||agg<60.0){
System.out.println("Second Division");
}
else if(agg>=40.0||agg<50.0){
System.out.println("Third Division");
}
else{
System.out.println("invalid input");
}
}}