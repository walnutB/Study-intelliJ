import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
//        보너스를 지급하려고한다.
//        근무시간과 본봉을 입력받아 근무시간에 따라 보너스를 계산하여 본봉과 합하여 출력하는 프로그램을 작성
//        ----------------------------------------—
//        근무시간                                 보너스
//        ——————————————————————
//                25시간이상                           본봉의 100%
//                20시간이상                           본봉의 80%
//                18시간이상                           본봉의 50%
//                18시간미만                           없음
//        ——————————————————————
//        [출력결과]
//        근무시간입력:20
//        본봉입력:1000000
//                ================
//        보너스:800000
//        지급될 급여:1800000
        Scanner scan = new Scanner( System.in );
        System.out.print( "근무시간 입력 : " );
        int time = scan.nextInt();
        System.out.print( "본봉 입력 : " );
        int money = scan.nextInt();
        System.out.println( "============" );
        double bonus = 0;
        if( time >= 25 ){
            bonus = money * 1;
        }else if( time >= 20 ){
            bonus = money * 0.8;
        }else if ( time >= 18 ){
            bonus = money * 0.5;
        }else{
            bonus = 0;
        }
        System.out.println( "보너스 : " + (int)bonus );
        System.out.println( "지급될 급여 : " + (int)( bonus + money ) );


    }
}
