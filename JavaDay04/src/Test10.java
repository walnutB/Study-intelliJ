import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {

//        두 정수를 입력받아 사용자 정의 메소드를 사용해서 두 수 중 큰 값을 구해서 출력해 보세요.

        Scanner scan = new Scanner( System.in );

        System.out.println( "정수 1 입력" );
        int n1 = scan.nextInt();
        System.out.println( "정수 2 입력" );
        int n2 = scan.nextInt();

        System.out.println( "두 수 중 큰 값은 " + mBig( n1, n2 ) + "입니다." );

    }

    public static int mBig ( int a, int b ){

        int c = ( a > b ) ? a : b ;

        return c;

    }

}
