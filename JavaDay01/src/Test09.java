import java.util.Scanner;

import static java.lang.Math.PI;

public class Test09 {
    public static void main(String[] args) {
//        반지름(double)을 입력받아 원의 넓이를 구해보세요.
//                원의넓이=반지름*반지름*3.14
        Scanner scan = new Scanner(System.in);
        System.out.println( "원의 반지름 입력" );
        double cir = scan.nextDouble();
        System.out.println( "원의 넓이 : " + cir*cir*PI );
    }
}
