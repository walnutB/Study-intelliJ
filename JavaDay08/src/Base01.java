abstract class Shape{ // 추상클래스
    private double x;
    private double y;
    public Shape ( double x, double y ){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public abstract void draw(); // 추상메소드
}
class Rect extends Shape{
    public Rect( double x, double y ){
        super( x, y );
    }
    @Override
    public void draw() {
        System.out.println( getX() + ", " + getY() +"의 위치에 사각형 그리기" );
    }
}
public class Base01 {
    public static void main(String[] args) {
//        Shape s = new Shape(); <- 에러
        Rect r = new Rect( 100.5, 20.5 );
        r.draw();
    }
}
