import java.util.Random;

public class Test08 {

    public static void main(String[] args) {

//        - 임의의 난수 6개를 발생시켜 배열에 저장하고 출력해 보기(중복값 없이)
//
//        난수의 범위는 1부터 45

        Random rnd = new Random();


        int rnn[] = new int [ 6 ];

        for ( int i = 0 ; i < rnn.length ; i++ ){

            rnn [ i ] = rnd.nextInt( 45 ) + 1;

            for ( int j = 0 ; j < rnn.length ; j++ ){

                if ( i != j && rnn [ i ] == rnn [ j ] )rnn [ i ] = rnd.nextInt( 45 ) + 1;

            }

            System.out.print( rnn [ i ] + " " );
        }

    }
}
