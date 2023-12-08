public class multilevelinheritance {
    public double area;

    void circle(int r){

        area=3.14*r*r;
    }

}
class cy extends multilevelinheritance {
    public double vol;
    void cal1(int h) {

            vol = area * h;
        }


}
class cone extends cy {
        private double volofcone;

        void cal() {

            volofcone = 0.3 * vol;
        }

        void diplay() {
            System.out.println("area of circle = " + area);
            System.out.println("volume of cylinder = " + vol);
            System.out.println("volume of cone = " + volofcone);
        }

        public static void main(String[] args) {
            cone c = new cone();
            c.circle(5);
            c.cal1(10);
            c.cal();
            c.diplay();

        }

    }









n