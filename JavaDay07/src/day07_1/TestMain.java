package day07_1;
import test.Shape;
class Rect extends Shape{
    public Rect ( int x, int y ){
        super( x, y );
    }
    public void draw(){
        System.out.println( "사각형 좌표: " + x + ", " + y );
        System.out.println( "사각형 그리기" );
    }
}
public class TestMain {
    public static void main(String[] args) {
//        Shape s = new Shape( 100, 200 );
//        s.printXY();
        Rect r = new Rect( 300, 400 );
        r.printXY();
        r.draw();
    }
}
