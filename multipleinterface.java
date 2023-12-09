interface one{
String lan="english";
public void dis2();
}
class lib{
String bname;
int bno;
void get(int no,String name){
bname=name;
bno=no;
}
void dis1(){
System.out.println("book number = "+bno);
}
}
class multipleinter extends lib implements one{
public void dis2(){
System.out.println("book name = "+bname);
System.out.println("book lan = "+lan);
}
}
class multipleinterface{
public static void main(String[] args){
multipleinter m=new multipleinter();
m.get(12,"harry potter");
m.dis1();
m.dis2();
}
}
