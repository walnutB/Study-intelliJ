import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
//        임의의 정수를 입력받아 삼항연산자를 사용하여 절대값 구하기
//        예) 정수 입력→-10
//        결과: -10의 절대값은 10입니다.
        Scanner scan = new Scanner(System.in);
        System.out.println( "정수 입력" );
        int n1 = scan.nextInt();
        System.out.println( n1 + "의 절대값은 " + (n1>0?n1:-n1) + "입니다." );

    }
}
