import java.util.Scanner;

public class Test13 {

    public static void main(String[] args) {

//        학생5명의 이름과 점수를 입력받아 배열에 저장하고 전체총점,전체평균,가장 높은 점수와 학생이름,
//                가장 낮은 점수와 학생이름을 구해서 출력해 보세요.

        Scanner scan = new Scanner( System.in );
        String[] name = new String [ 5 ];
        double[] score = new double [ 5 ];

        double tot = 0;

        for ( int i = 0 ; i <score.length ; i++ ){

            System.out.print( "학생이름입력" );
            name [ i ] = scan.next();
            System.out.print( "학생점수입력" );

            score [ i ] = scan.nextDouble();
            tot += score [ i ];

        }
        double max = score [ 0 ];
        String maxName = name [ 0 ];
        double min = score [ 0 ];
        String minName = name [ 0 ];

        for ( int i = 0 ; i < score.length ; i++ ){

            if (max < score [ i ]) {
                max = score [ i ];
                maxName = name[ i ];
            }

        }

        for ( int i = 0 ; i < score.length ; i++ ){

            if (min > score [ i ]) {
                min = score [ i ];
                minName = name[ i ];
            }
        }

        System.out.print( "전체총점: " + tot );
        System.out.println();
        System.out.print( "전체평균: " + ( tot / 5 ) );
        System.out.println();
        System.out.println( "가장 높은 점수: " + max + ", 학생이름: " + maxName );
        System.out.println( "가장 낮은 점수: " + min + ", 학생이름: " + minName );
    }
}
