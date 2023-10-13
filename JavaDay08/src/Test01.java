abstract class MyArea{
    protected int x;
    protected int y;
    public MyArea( int x, int y ){
        this.x = x;
        this.y = y;
    }
    public abstract int getArea();
}
class MyRect extends MyArea{
    public MyRect( int x, int y ){
        super( x, y );
    }
    @Override
    public int getArea() { return x * y; }
}
class MyTri extends MyArea{
    public MyTri( int x, int y ){
        super( x, y );
    }
    @Override
    public int getArea() { return ( x * y ) / 2 ; }
}
public class Test01 {
    public static void main(String[] args) {
        MyRect r = new MyRect( 100, 200 );
        System.out.println( "사각형의 넓이: " + r.getArea() );

        MyArea ma = new MyTri( 100, 200 );
        System.out.println( "삼각형의 넓이: " + ma.getArea() );
    }
}
