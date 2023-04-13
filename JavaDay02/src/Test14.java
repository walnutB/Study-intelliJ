import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
//        단을 입력받아 구구단을 출력해 보세요
        Scanner scan = new Scanner( System.in );
        System.out.print( "단입력 : " );
        int n = scan.nextInt();
        System.out.println( "[ " + n + "단 ]" );
        for( int i = 1 ; i <=9 ; i++ ){
            System.out.println( n + "*" + i + "=" + ( n*i ) );
        }

    }
}
