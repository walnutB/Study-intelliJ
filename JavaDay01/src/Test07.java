import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
//        가로/세로길이를 입력받아 사각형 넓이 구해보세요.
        Scanner scan = new Scanner(System.in);
        System.out.println( "가로길이 입력" );
        int n1 = scan.nextInt();
        System.out.println( "세로길이 입력" );
        int n2 = scan.nextInt();
        System.out.println( "사각형의 넓이는 " + (n1*n2) + "이다." );
//        세 정수를 입력받아 세 정수중 가장 큰 값을 구해 보세요.
        System.out.println( "정수1 입력" );
        int nn1 = scan.nextInt();
        System.out.println( "정수2 입력" );
        int nn2 = scan.nextInt();
        System.out.println( "정수3 입력" );
        int nn3 = scan.nextInt();
        int nn4 = nn1;
        if( nn4 < nn2 ){
            nn4 = nn2;
            if( nn4 < nn3 ) {
                nn4 = nn3;
            }
        }
        System.out.println( "세 정수 중 가장 큰 수는 " + nn4 + "이다");
    }
}
