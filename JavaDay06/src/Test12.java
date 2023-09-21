import java.util.Arrays;

class MyArray{
    public static void reverse( int[] a ){
        for ( int i = a.length - 1; i >= 0 ; i-- ){
            System.out.print( a[ i ] + " " );
        }
        System.out.println();
    }
    public static int max( int[] a ){
        int b = a[ 0 ];
        for( int i = 0 ; i < a.length ; i++ ){

            if( b < a[ i ] )b = a [ i ];

        }
        return b;
    }
    public static void sort( int[] a ){
        int[] b = new int[ a.length ];
        int temp;
        for( int i = 0; i < a.length ; i++ ){
            b[ i ] = a [ i ];
        }
        for ( int i = 0 ; i < b.length ; i++ ){
            for ( int j = i + 1; j < b.length; j++ ){
                if ( b[ i ] > b[ j ] ){
                    temp = b [ i ];
                    b[ i ] = b[ j ];
                    b[ j ] = temp;
                }
            }
        }
        for ( int i = 0 ; i < b.length; i++ ){
            System.out.print( b[ i ] + " " );
        }
        System.out.println();
    }
}
public class Test12 {
    public static void main(String[] args) {
        int[] a = { 4, 6, 29, 10, 30 };
        MyArray.reverse( a ); //배열이 거꾸로 츨력됨 : 30 10 29 6 4
        int max = MyArray.max ( a ); // 배열 요소중 가장 큰 값을 얻어옴
        System.out.println( "배열요소중 가장 큰 값:" + max );
        MyArray.sort( a ); // 배열이 오름차순정렬되어 출력됨: 4 6 10 29 30
    }
}
