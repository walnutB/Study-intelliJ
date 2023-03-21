import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
//        임의의 정수를 입력받아 짝수인지 홀수인지 판별해 보세요-> 삼항연산자 이용
        Scanner scan = new Scanner( System.in );
        System.out.println( "정수입력" );
        int n1 = scan.nextInt();
        System.out.println( n1 % 2 == 1?"홀수":"짝수");

    }
}
