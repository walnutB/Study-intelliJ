package day07_2;
class Rect1{
    protected double w;
    protected double h;
    public void setXY( double w, double h ){
        this.h = h;
        this.w = w;
    }
    public double getArea(){
        return w * h;
    }
}
class Tri extends Rect1{
    @Override
    public double getArea(){
        return w * h * 0.5;
    }
}
public class Test02 {
    public static void main(String[] args) {
        Tri t = new Tri();
        t.setXY( 2.9, 3.5 );
        System.out.println( "삼각형의 넓이: " + t.getArea() );
    }
}

