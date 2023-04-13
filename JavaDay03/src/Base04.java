import java.util.Scanner;

public class Base04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        while (true){
            System.out.println( "단 입력(종료:0)" );
            int dan = scan.nextInt();
            if( dan == 0)break;
            if( dan < 2 || dan >9 ){
                System.out.println( "2에서 9사이의 숫자 입력하시오" );
                continue;
            }
            System.out.println( "<<" + dan + "단>>" );
            int i = 1;
            while ( i <= 9 ){
                System.out.println( dan + "*" + i + "=" + ( dan * i ) );
                i++;
            }
        }
    }
}
