import java.util.Scanner;

public class Base07 {

    public static void main(String[] args) {

        printCircle();

    }

    public static void printCircle(){

        Scanner scan = new Scanner( System.in );

        System.out.println( "반지름 입력" );
        double r = scan.nextDouble();

        double area = r * r * 3.14;

        System.out.println( "원의 넓이 :" + area );

    }
}
