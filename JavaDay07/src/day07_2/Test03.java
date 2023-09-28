package day07_2;

import test.Shape;
import test.Shape;

class Rect2 extends Shape{
    public Rect2 ( int x, int y){
        super ( x, y );
    }
    @Override
    public void draw() { //오버라이딩
        System.out.println( "사각형 그리기" );
    }
    public void changeSize( int w, int h ){
        System.out.println( "가로:" + w + ", 세로:" + h + "크기로 변경하기" );
    }
}
class Circle2 extends Shape {
    private double r;
    public Circle2( int x, int y, double r ){
        super( x, y );
        this.r = r;
    }
    @Override
    public void draw(){
        System.out.println( "반지름이 " + r + "인 타원 그리기" );
    }
    public void changeR( double r ){
        System.out.println( "반지름을 " + r + "로 변경" );
    }
}
public class Test03 {
    public static void main(String[] args) {
//        Rect2 r = new Rect2( 100, 200 );
//        Shape s = r; // 가능
//        s.draw();
//        Circle2 c = new Circle2( 100, 200, 50 );
//        Shape s1 = c;
//        c.draw();
//        c.changeR( 1.2 );

        Rect2 r = new Rect2( 100, 200 );
        Circle2 c = new Circle2( 100, 200, 50 );
        printMoniter( r );
        printMoniter( c );

        sizeChange( r );
        sizeChange( c );

    }
    public static void printMoniter( Shape s ){
        System.out.println( "<< 화면으로 그리기.. >>" );
        s.draw();
    }
//    public static void sizeChange( Rect2 r ){
//        System.out.println( "<<< 화면에 출력된 도형 크기 변경하기 >>>" );
//        r.changeSize( 500, 600 );
//    }
//    public static void sizeChange( Circle2 c ){
//        System.out.println( "<<< 화면에 출력된 도형 크기 변경하기 >>>" );
//        c.changeSize( 100 );
//    }
    public static void sizeChange( Shape s ){
        System.out.println( "<< 화면에 출력된 도형 크기 변경하기 >>" );
        if ( s instanceof Rect2 ){
            Rect2 r = ( Rect2 ) s;
            r.changeSize( 500, 600 );
        }
        if ( s instanceof Circle2 ){
            Circle2 c = ( Circle2 ) s;
            ((Circle2) s).changeR( 100 );
        }
    }
}
