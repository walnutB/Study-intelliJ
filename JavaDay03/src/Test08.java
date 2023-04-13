import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
//        단 입력받아 해당하는 구구단 출력해 보세요.
        Scanner scan = new Scanner( System.in );
        int n1 = 0;
        int n2 = 1;
        while( true ){
            System.out.print( "단입력 : " );
            n1 = scan.nextInt();
            if( n1 < 0 || n1 > 9 ){
                System.out.println( "1부터 9까지의 숫자만 입력하시오" );
            }else{
                System.out.println();
                System.out.println( "[ " + n1 + "단 ]" );
                while( n2 <= 9 ){
                    System.out.println( n1 + "*" + n2 + "=" + ( n1 * n2 ) );
                    n2++;
                }
                break;
            }
        }
    }
}
