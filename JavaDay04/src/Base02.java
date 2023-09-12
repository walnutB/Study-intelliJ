import java.util.Scanner;

public class Base02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );
        int[] b = new int [ 5 ];
        int tot = 0 ;

        for ( int i = 0; i < 5 ; i++ ){

            System.out.println( ( i + 1 ) + "번째 학생점수 입력" );
            b [ i ] = scan.nextInt();
            tot += b [ i ];

        }
        System.out.println( "<<입력된 학생 점수>>" );
        for ( int i = 0 ; i < 5 ; i++ ){

            System.out.println( b [ i ] );

        }
        System.out.println( "전체 총점: " + tot );

    }
}
