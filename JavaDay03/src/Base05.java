import java.util.Scanner;

public class Base05 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1 ;
        do {
            sum += i ;
            i++ ;
        } while ( i <= 100 ) ;
        System.out.println( "1부터 100까지의 합 : " + sum );
        Scanner scan = new Scanner( System.in );

        int dan = 0 ;
        do {
            System.out.println( "단입력(2~9사이의 수)" );
            dan = scan.nextInt() ;
        } while ( !(dan >= 2 && dan <= 9) ) ;
        System.out.println( dan + "단" );
        for ( i = 1 ; i <= 9 ; i++ ){
            System.out.println( dan + "*" + i + "=" + ( dan * i ) );

        }
    }
}
