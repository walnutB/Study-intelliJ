import java.util.Scanner;

public class Test16 {

    public static void main(String[] args) {

//        다섯명의 학생이름,국어,영어점수를 입력받고 총점,평균,등수를 계산해서 배열에
//        저장후 전체 데이터를 출력하세요.

        Scanner scan = new Scanner( System.in );
        String[] name = new String[ 5 ];
        double[][] score = new double[ 5 ][ 4 ];
        int [] rank = { 1, 1, 1, 1, 1 };

        for ( int i = 0 ; i < name.length ; i++ ){

            System.out.print( "학생이름입력: " );
            name [ i ] = scan.next();
            System.out.print( "국어점수입력: " );
            score [ i ][ 0 ] = scan.nextDouble();
            System.out.print( "영어점수입력: " );
            score [ i ][ 1 ] = scan.nextDouble();

            score [ i ][ 2 ] = score [ i ][ 0 ] + score [ i ][ 1 ];
            score [ i ][ 3 ] = score [ i ][ 2 ] / 2.0;

        }

        for ( int i = 0 ; i < name.length ; i++ ){

            for( int j = 0 ; j < name.length ; j++ ){

               if ( score [ i ] [ 2 ] < score [ j ] [ 2 ] ) rank [ i ]++;

            }

        }

        for ( int i = 0 ; i < name.length ; i++ ){

            System.out.println( name [ i ] + ": " + name[ i ] +
                    "국어점수: " + score [ i ][ 0 ] +
                    ", 영어점수: " + score [ i ][ 1 ] +
                    ", 총점: " + score [ i ][ 2 ] +
                    ", 평균: " + score [ i ][ 3 ] +
                    ", 등수: " +rank [ i ] );

        }


    }
}
