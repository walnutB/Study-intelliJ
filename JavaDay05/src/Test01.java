import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

//        임의의 정수를 입력받아 절대값을 구해서 리턴하는 매소드를 만들고 이를 사용하기

        Scanner scan = new Scanner( System.in );
        System.out.println( "정수입력:" );
        int n1 = scan.nextInt();
        System.out.println( "절대값은 " + ab( n1 ) + "입니다." );

    }

    public static int ab ( int a ){

        return a < 0 ? -a : a ;

    }
}
