interface shape{
double pi=3.14;
double volume(double a);
}
class sp implements shape{
public double volume(double a){
return((4.0/3.0)*pi*a*a*a);
}
}
class cone implements shape{
public double volume(double a){
return((1.0/3.0)*pi*a*a);
}
}
class test{
public static void main(String[] args){
sp s=new sp();
System.out.println(s.volume(1.0));
cone c=new cone();
System.out.println(c.volume(1.0));
}
}
