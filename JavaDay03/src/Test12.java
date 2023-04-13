import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
//        - 임의의 수를 입력받아 연산결과가 나오도록 프로그램을 작성하기
//        - 5 를 입력하면
//        1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)를 연산한 결과가 나온다.
//        - 출력결과: 35
        Scanner scan = new Scanner( System.in );
        System.out.println( "정수 입력" );
        int n1 = scan.nextInt();
        int n2 = 0;
        for ( int i = 1; i <= n1 ; i++ ){
            for( int j = 1; j <= i ; j++ ){
                n2 += j;
            }
        }
        System.out.println( "출력결과 :" + n2 );
    }
}
