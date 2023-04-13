import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
//        덧셈 계산 프로그램 작성하기
//        1+2=3
//        3+4=__
//        ...
//        →덧셈 연산할 두 수는 랜덤한 난수이고 사용자가 답을 입력해 맞춘다.
//        문제는 10문제가 나오고 점수(한 문제당 10점)와 맞은 갯수를 출력하세요
        Scanner scan = new Scanner( System.in );
        Random rnd = new Random();
        int cnt = 0;
        for( int i = 1 ; i <= 10 ; i++ ){

            int a = rnd.nextInt( 11 );
            int b = rnd.nextInt( 11 );
            System.out.print( i + "번 문제: " + a + "+" + b + "=" );
            int c = scan.nextInt();
            if( c == ( a+b ) ){
                cnt++;
            }
        }
        System.out.println( "점수 : " + ( cnt*10 ) + " 점, 맞은 갯수 :" + cnt );
    }
}
