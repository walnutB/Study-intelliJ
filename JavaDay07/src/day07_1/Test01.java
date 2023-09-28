package day07_1;
class MyRect {
    private int x;
    private int y;
    public MyRect( int x, int y ){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getArea(){
        return x * y;
    }
}
class MyBox extends MyRect{
    private int h;
    public MyBox( int x, int y, int h ){
        super( x, y );
        this.h = h;
    }
    public int getVolume(){
        return getX() * getY() * h;
    }
}
public class Test01 {
    public static void main(String[] args) {
        MyBox mb = new MyBox( 100, 200, 300 );
        System.out.println( "사각형의 부피: " + mb.getVolume() );
    }
}
