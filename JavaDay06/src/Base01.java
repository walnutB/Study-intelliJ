class Rect{
    public int getArea( int x, int y ){
        return x*y;
    }
    public double getArea( double x, double y ){
        return x*y;
    }
    public int getArea( int x ){
        return x*x;
    }
}
public class Base01 {
    public static void main(String[] args) {
        Rect r = new Rect();
        int a = r.getArea( 100, 200 );
        System.out.println( "넓이1: " + a );
        double b = r.getArea( 100.5, 200.5 );
        System.out.println( "넓이2: " + b );
        int c = r.getArea( 100 );
        System.out.println( "넓이3: " + c );
    }
}
