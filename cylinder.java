public class inheritance {
    protected double area;

    void circle(int r){
        area=3.14*r*r;
    }

}
class cylinder extends inheritance{
    private double vol;

    void cyli(int h){
        vol=area*h;
    }
    void diplay(){
        System.out.println("area of circle = "+area);
        System.out.println("volume of cylinder = "+vol);
    }
        public static void main(String[] args) {
            cylinder c=new cylinder();
            c.circle(5);
            c.cyli(10);
            c.diplay();
        }
    }

