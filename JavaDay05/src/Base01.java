public class Base01 {

    public static void main(String[] args) {

        int c = sum ( 1, 2, 3 );
        System.out.println( "세 수 합: " + c );
        int c1 = sum ( 100, 200 );
        System.out.println( "두 수 합: " + c1 );

    }

    public static int sum ( int ... a ){

        int s = 0;
        for( int i = 0; i < a.length ; i++ ){

            s += a [ i ];

        }

        return s;

    }

}
