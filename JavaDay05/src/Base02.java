public class Base02 {

    public static void main(String[] args) {

        int n1 = sum ( 10, 20, 30 );
        System.out.println( "세 수 합: " + n1 );

    }

    public static int sum ( int n, int ... a ){

        System.out.println( "n: " + n );
        int s = 0 ;
        for ( int i = 0; i < a.length ; i++ ){

            s += a[ i ];

        }
        return s;

    }

}
