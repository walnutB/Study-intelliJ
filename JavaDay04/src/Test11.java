import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {

//        반지름을 입력받아 원의 넓이(반지름*반지름*3.14)를 구하는 메소드를 만들고 이를 이용해 원의 넓이를 구해서 출력해 보세요
        Scanner scan = new Scanner( System.in );

        System.out.println( "반지름 입력" );
        double n1 = scan.nextDouble();

        System.out.println( "원의 넓이 : " + cir ( n1 ) );

    }

    public static double cir ( double a ){

        return a * a * 3.14;

    }
}
