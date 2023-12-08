public class areaoftriangle {
    void triangle(int b,int h){
        double area=0.5*b*h ;
        System.out.println("area of triangle = "+area);
    }

    public static void main(String[] args) {
        areaoftriangle t=new areaoftriangle();
        t.triangle(12,10);

    }

}
