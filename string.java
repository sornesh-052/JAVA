public class string{
    public String s="I Love java";


    void get1(){

        System.out.println("lower case of string1 = "+s.toLowerCase());
        System.out.println("upper case of string1 = "+s.toUpperCase());
        System.out.println("after replacing i with o ="+s.replace('o','i'));
        System.out.println("first char of string = "+s.substring(1));
        System.out.println("printing certain chars in string + "+s.substring(2,6));
        System.out.println("index of l ="+s.indexOf("L"));
        System.out.println("length of string = "+s.length());
        System.out.println("char at index 2 = "+s.charAt(2));

    }
}
class dem extends string{
    private String s1="java";
    private String s2="JAVA";
    void get2(){

        System.out.println("lower case of string2 = "+s1.toLowerCase());
        System.out.println("upper case of string2 = "+s1.toUpperCase());

    }
    void get3(){

        System.out.println("lower case of string3 = "+s2.toLowerCase());
        System.out.println("upper case of string3 = "+s2.toUpperCase());


    }
    void equal(){
        System.out.println("is string 2 and string 3 are equal = "+s1.equals(s2));
        System.out.println("comparing string 2 and string 3 = "+s1.compareTo(s2));
    }

    public static void main(String[] args) {
        dem d=new dem();
        d.get1();
        d.get2();
        d.get3();
        d.equal();
    }
}