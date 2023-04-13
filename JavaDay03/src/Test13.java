import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
//        - 임의의 정수를 입력받아 소수인지 아닌지 출력하기
//        소수:1과 자신으로만 나누어지는 수(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31....)
//        - (힌트 : for문으로 입력된 정수가 100이면 2부터 99까지 나눠본다)
//        - 정수입력:5
//        5는 소수입니다.
        Scanner scan = new Scanner( System.in );
        System.out.println( "정수입력" );
        int n = scan.nextInt();
        int n1 = 0;
        for ( int i = 2 ; i < n ; i++ ){
            if ( n % i == 0 ) n1++;
        }
        if ( n1 != 0 ){
            System.out.println( n + "은 소수가 아닙니다." );
        }else {
            System.out.println( n + "은 소수입니다. " );
        }
    }
}
