import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
//        키와 몸무게를 입력받아 비만도 측정프로그램 작성해 보세요.
//        - 표준 몸무게 구하는 법
//                - 키 151 이상일 경우: (키－100)×0.9
//                - 키 150 이하일 경우: (키－100)
//        - 비만도 구하는 법
//        - 현재 몸무게 ÷ 표준 몸무게 ×100
//                - 비만도
//                - 90 미만= 저체중
//        90~110  = 정상체중
//        110~120 =과체중
//        120 이상 = 비만
        Scanner scan = new Scanner( System.in );
        System.out.print( "키를 입력하시오 : " );
        double tall = scan.nextDouble();
        System.out.print( "몸무게를 입력하시오 : " );
        double weight = scan.nextDouble();
        double major = 0;
        double fat = 0;
        String result = "";
        if( tall >= 151 ){
            major = (tall - 100) * 0.9;
        }else{
            major = tall - 100;
        }

        fat = (weight / major) * 100;

        if( fat < 90){
            result = "저체중";
        } else if ( fat <= 110  ) {
            result = "정상체중";
        } else if ( fat <= 120 ) {
            result = "과체중";
        }else {
            result = "비만";
        }

        System.out.println( "비만도 : " + result );

    }
}
