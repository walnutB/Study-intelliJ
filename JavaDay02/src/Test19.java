import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
//        임의의 정수를 입력받아 1부터 입력된 정수까지의 합을 구해서 출력해 보세요
        Scanner scan = new Scanner( System.in );
        System.out.print( "정수입력 : " );
        int n = scan.nextInt();
        int result = 0;
        for( int i = 1 ; i <= n ; i++ ){
            result += i;
        }
        System.out.println( "1부터 " + n + "까지의 합 : " + result );
    }
}
