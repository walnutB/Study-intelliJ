import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );
        int[] score = new int [ 11 ];
        for ( int i = 0 ; i < score.length ; i++ ){

            System.out.print( "1부터 100까지의 점수를 입력하시오." + ( i + 1 ) );
            int a = scan.nextInt();
            if ( a > 0 && a < 10 ){
                
                score [ 0 ]++;
                
            } else if ( a > 9 && a < 20 ) {

                score [ 1 ]++;
                
            } else if ( a > 19 && a < 30 ) {

                score [ 2 ]++;

            } else if ( a > 29 && a < 40 ) {

                score [ 3 ]++;

            } else if ( a > 39 && a < 50 ) {

                score [ 4 ]++;

            } else if ( a > 49 && a < 60 ) {

                score [ 5 ]++;

            } else if ( a > 59 && a < 70 ) {

                score [ 6 ]++;

            } else if ( a > 69 && a < 80 ) {

                score [ 7 ]++;

            } else if ( a > 79 && a < 90 ) {

                score [ 8 ]++;

            } else if ( a > 89 && a < 100 ) {

                score [ 9 ]++;

            } else {

                score [ 10 ]++;

            }

        }
        
        
    }
}
