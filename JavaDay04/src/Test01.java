import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

//        학생점수 5개가 저장될 배열을 선언하고 값을 입력받아 저장하고 출력하기
        Scanner scan = new Scanner( System.in );
        int[] a = new int[ 5 ];
        for ( int i = 0 ; i < 5 ; i++ ){

            System.out.print( ( i + 1 ) + "번 학생 점수 입력 : " );
            a [ i ] = scan.nextInt();

        }

        System.out.println( "<<입력된 학생점수>>" );

        for ( int i = 0 ; i < 5 ; i++ ){

            System.out.println( ( i + 1 ) + "번 학생점수: " + a [ i ] );

        }

//        위 배열 코드에 저장된 값 중에서 가장 높은 점수를 구해서 출력하기

        int max = a [ 0 ];
        for ( int i = 0 ; i < 5 ; i++ ){

            if ( max < a [ i ] ) max = a [ i ];

        }
        System.out.println( "가장 높은 점수: " + max );

//        위 배열 코드에 저장된 값 중에서 가장 낮은 점수 구해서 출력하기
        int min = a [ 0 ];
        for ( int i = 0 ; i < 5 ; i++ ){

            if ( min > a [ i ] ) min = a [ i ];

        }
        System.out.println( "가장 낮은 점수 : " + min );


    }
}
