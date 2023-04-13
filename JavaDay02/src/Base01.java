import java.util.Scanner;

public class Base01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "임의의 정수 입력" );
        int n1 = scan.nextInt();
        String result = "짝수";
        if( n1 % 2 != 0){
            result = "홀수";
        }
        System.out.println( n1 + "은 " + result + "입니다." );
        // 두 정수를 입력받아 두 수중 큰 값을 구해서 출력해 보세요.(if문 사용하기)
        System.out.println( "두 정수 입력" );
        int nn1 = scan.nextInt();
        int nn2 = scan.nextInt();
        if( nn1 > nn2 ){
            System.out.println( "큰 값은 " + nn1 + "입니다." );
        }else if ( nn2 > nn1 ){
            System.out.println( "큰 값은 " + nn2 + "입니다." );
        }else {
            System.out.println( "입력된 두 값이 같습니다." );
        }
    }
}