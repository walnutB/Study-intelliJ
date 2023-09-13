public class Base06 {

    public static void main(String[] args) {

        int[] a = { 10, 20, 30, 40, 50 };
        printArray( a );

    }

    public static void printArray ( int[] a ){ // 리턴값이 없으면 리턴형을 void로 적는다.

        for ( int i = 0 ; i < a.length ; i++ ){

            System.out.print( a[ i ] + " " );

        }
        System.out.println();

    }

}
