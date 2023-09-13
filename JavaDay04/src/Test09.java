import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {

//        가로와 세로길이를 소수점단위로 입력받아 메소드를 사용해서 사각형 넓이가 출력되도록 하기

        Scanner scan = new Scanner( System.in );

        System.out.println( "가로길이입력" );
        double n1 = scan.nextDouble();
        System.out.println( "세로길이입력" );
        double n2 = scan.nextDouble();

        System.out.println( "사각형의 넓이: " + tri ( n1, n2 ) );

    }

    public static double tri( double a, double b ){

        double c = a * b;

        return c;

    }

}
