import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
//        임의의 수를 입력받아 for문을 사용해서 팩토리얼값을 구해 보세요.
        Scanner scan = new Scanner( System.in );
        System.out.println( "정수입력" );
        int n = scan.nextInt();
        int fac = 1;
        for( int i = 1 ; i <= n ; i++ ){
            fac *= i;
        }
        System.out.println( n + "의 팩토리얼값은 " + fac + "이다." );
    }
}
