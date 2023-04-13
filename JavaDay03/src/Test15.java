import java.util.Random;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
//        - 가위바위보 게임
//        - 가위:1 바위:2 보자기:3
//        가위바위보를 내세요:1
//        - [결과]
//        나:가위
//        컴퓨터:바위
//                ==> 컴퓨터가 이겼습니다.

        Scanner scan = new Scanner( System.in );
        Random rnd = new Random();
        System.out.print( "가위바위보를 내세요: " );
        String me = "";
        String com = "";
        for ( int i = 1 ; i <= 6 ; i++ ){
            System.out.println( "가위바위보 게임" );
            System.out.println( "가위: 1  바위: 2  보자기:  3" );
            System.out.print( "가위바위보를 내세요: " );
            int n1 = scan.nextInt();
            int n2 = rnd.nextInt( 3 ) + 1;
            if ( n1 == 1 ) me = "가위";
            if ( n2 == 1 ) com = "가위";
            if ( n1 == 2 ) me = "바위";
            if ( n2 == 2 ) com = "바위";
            if ( n1 == 3 ) me = "보";
            if ( n2 == 3 ) com = "보";

            if ( n1 == n2 ) {
                System.out.println( "[결과]" );
                System.out.println( "나: " + me );
                System.out.println( "컴퓨터: " + com );
                System.out.println( "비겼습니다.");
                break;
            }else if ( (n2 == 1 && n1 == 3) || (n2 == 2 && n1 == 1) || (n2 == 3 && n1 == 2) ){
                System.out.println( "[결과]" );
                System.out.println( "나: " + me );
                System.out.println( "컴퓨터: " + com );
                System.out.println( "컴퓨터가 이겼습니다.");
                break;
            }else {
                System.out.println( "[결과]" );
                System.out.println( "나: " + me );
                System.out.println( "컴퓨터: " + com );
                System.out.println( "당신이 이겼습니다. ");
                break;
            }
        }







    }
}
