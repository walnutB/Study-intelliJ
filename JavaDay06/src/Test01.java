
class MyMath{

    public int abs( int a ){

        if( a < 0  ){

            return -a;
        } else {

            return a;

        }
    }
    public double abs( double a ){

        if( a < 0  ){

            return -a;
        } else {

            return a;

        }
    }
    public long abs( long a ){

        if( a < 0  ){

            return -a;
        } else {

            return a;

        }
    }
    public float abs( float a ){

        if( a < 0  ){

            return -a;
        } else {

            return a;

        }
    }

}
public class Test01 {
    public static void main(String[] args) {

        MyMath m = new MyMath();

        int a = m.abs( -10 );
        double b = m.abs( -10.6 );
        long c = m.abs( -111111111111111111L );
        float d = m.abs( -2.5658f );

        System.out.println( "a: " + a );
        System.out.println( "b: " + b );
        System.out.println( "c: " + c );
        System.out.println( "d: " + d );

    }
}
