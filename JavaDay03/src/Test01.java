public class Test01 {
    public static void main(String[] args) {
//        다중 for문을 사용해서 아래 산 모양 출력하기
//        *****
//        ****
//        ***
//        **
//        *
        for ( int i = 1 ; i <= 5 ; i++){
            for ( int j = 1 ; j <= 5 ; j++ ){
                if ( i <= j ){
                    System.out.print( "*" );
                }
            }
            System.out.println();
        }
        System.out.println();
        for ( int i = 1 ; i <= 5 ; i++ ){
            for ( int j = i ; j <= 5 ; j++ ){
                System.out.print( "*" );
            }
            System.out.println();
        }

        System.out.println();

        for ( int i = 5 ; i > 0 ; i-- ){
            for ( int j = 1 ; j <= i ; j++ ){
                System.out.print( "*" );
            }
            System.out.println();
        }

    }
}
