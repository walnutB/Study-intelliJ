import java.util.Scanner;

public class Test07 {

    public static void main(String[] args) {

//        - 학생답안 10개를 입력받아 5명 학생의 점수 출력하기- 2차원 배열 사용
//        - 정답 : int[] dap={1,2,3,4,2,3,4,1,1,4};
//        - 학생답입력
//        1,1,2,4,2,3,4,1,1,4
//        학생점수:80점

        final int[] dap={1,2,3,4,2,3,4,1,1,4};

        Scanner scan = new Scanner( System.in );
        int std[][] = new int [ 5 ] [ 11 ];

        for ( int i = 0 ; i < std.length ; i++ ){

            for ( int j = 0 ; j < 10 ; j++ ){

                System.out.println( ( i + 1 ) + "번째 학생 " + ( j + 1 ) + "번째 답 입력" );
                std [ i ] [ j ] = scan.nextInt();

                if ( std [ i ] [ j ] == dap [ j ] ) std [ i ] [ 10 ] += 10 ;

            }

        }

        for ( int i = 0 ; i < std.length ; i++ ) {

            System.out.print( ( i + 1 ) + "번째 학생 답: " );

            for ( int j = 0 ; j < 10 ; j++ ) {

                System.out.print( std [ i ] [ j ] + " " );

            }

            System.out.println( "학생점수: " + std [ i ] [ 10 ] );

        }

    }
}
