import java.util.Scanner;

public class Test15 {

    public static void main(String[] args) {

//        학생점수를 5개 입력받아 등수를 구해 보세요.
        Scanner scan = new Scanner( System.in );
        int[] score = new int[ 5 ];
        int[] field = { 1, 1, 1, 1, 1 };

        for ( int i = 0 ; i < score.length ; i++ ){

            System.out.print( ( i + 1 ) + "번째 학생점수입력" );
            score [ i ] = scan.nextInt();

        }

        for ( int i = 0 ; i < score.length ; i++ ){

            for ( int j = 0 ; j < score.length ; j++ ){

                if ( score [ i ] < score [ j ] ) field [ i ]++;

            }

        }

        for ( int i = 0 ; i < score.length ; i++ ){

            System.out.println( ( i + 1 ) + "번째 학생의 점수: " + score [ i ] + ", 등수: " + field [ i ] );

        }

    }
}
