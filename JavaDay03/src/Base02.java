import java.util.Random;
import java.util.Scanner;

public class Base02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        for( int i = 1 ; i <= 5 ; i++ ){
            int n = rnd.nextInt(10);
            System.out.print( n + " " );
        }
        System.out.println();
        Scanner scan = new Scanner( System.in );
        int r = rnd.nextInt(10) + 1;
        int inputCnt = 0 ;
        for(;;){
            System.out.println( "예상되는 숫자 입력" );
            int num = scan.nextInt();
            inputCnt++;
            if( r == num){
                System.out.println( "숫자를 맞췄습니다" );
                System.out.println( "정답까지 입력한 횟수 : " + inputCnt );
                break;
            }else {
                System.out.println( "틀린 숫자를 입력했습니다." );
            }
        }

    }
}
