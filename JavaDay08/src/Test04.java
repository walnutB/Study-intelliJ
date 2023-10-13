
interface Shape2{
    void draw();
    void paint();
}
interface Point{
    void setPoint( int x, int y ); // 좌표지정
}
interface Rect2 extends Shape2, Point{ // 인터페이스끼리 상속할때는 extends를 사용한다.
    void resize();
}
class MyRect1 implements Rect2{
    private int x;
    private int y;
    @Override
    public void draw() {
        System.out.println( x + ", " + y + "위치에 사각형 그리기" );
    }
    @Override
    public void paint() {
        System.out.println( "사각형 칠하기" );
    }
    @Override
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void resize() {
        System.out.println( "사각형 크기 변경하기" );
    }
}
public class Test04 {
    public static void main(String[] args) {
        MyRect1 mr = new MyRect1();
        mr.setPoint( 100, 100 );
        mr.draw();
        mr.paint();

    }
}
