interface Shape1{
    double PI = 3.141592;  // static final 이 생략됨
    void draw(); // public abstract 가 생략됨
    void paint( String color );
    default void size(){
        System.out.println( "기본사이즈로 설정됨" );
    }
}
class Rect1 implements Shape1{
    @Override
    public void draw() {
        System.out.println( "사각형 그리기" );
    }
    @Override
    public void paint(String color) {
        System.out.println( color + "색상으로 사각형 칠하기" );
    }
}
class Circle1 implements Shape1{
    @Override
    public void draw() {
        System.out.println( "타원 그리기" );
    }
    @Override
    public void paint(String color) {
        System.out.println( color + "색상으로 타원 칠하기" );
    }

    @Override
    public void size() {
        System.out.println( "원의 크기 변경" );
    }
}
public class Base02 {
    public static void main(String[] args) {
        System.out.println( Shape1.PI );
        Rect1 r1 = new Rect1();
        r1.draw();
        r1.paint( "Red" );
        r1.size();
        Circle1 c1 = new Circle1();
        c1.size();

    }
}
