import java.util.Scanner;

public class Test06 {

    public static void main(String[] args) {
//        - 4명 학생의 번호,국어,영어,수학점수를 입력받아 총점,평균을 구해서 배열에 저장하고 출력하기
//        - 2차원 배열 사용하기

        Scanner scan = new Scanner( System.in );

        int a[][] = new int [ 4 ] [ 6 ];

        for ( int i = 0 ; i < a.length ; i++ ){

            System.out.print( "번호입력: " );
            a [ i ] [ 0 ] = scan.nextInt();
            System.out.print( "국어점수입력: " );
            a [ i ] [ 1 ] = scan.nextInt();
            System.out.print( "영어점수입력: " );
            a [ i ] [ 2 ] = scan.nextInt();
            System.out.print( "수학점수입력: " );
            a [ i ] [ 3 ] = scan.nextInt();

            a [ i ] [ 4 ] = a [ i ] [ 1 ] + a [ i ] [ 2 ] + a [ i ] [ 3 ];

            a [ i ] [ 5 ] = a [ i ] [ 4 ] / 3 ;

        }

        for ( int i = 0 ; i < a.length ; i++ ){

            for ( int j = 0 ; j < a [ 0 ].length ; j++ ){

                System.out.print( a [ i ] [ j ] + " " );

            }

            System.out.println();

        }


    }

}
