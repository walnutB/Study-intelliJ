package day07_2;

import test.Shape;

class Rect extends Shape{
    public Rect ( int x, int y){
        super ( x, y );
    }
    @Override
    public void draw() { //오버라이딩
        System.out.println( "사각형 그리기" );
    }
    public void draw( String color ){ //오버로딩
        System.out.println( color + "색상 사각형 그리기" );
    }
}
public class Base05 {
    public static void main(String[] args) {
        Rect r = new Rect( 100, 200 );
        r.printXY();
        r.draw();
        Circle c = new Circle( 400, 500, 50.5 );
        c.draw();
    }
}
