public class Test17 {
    public static void main(String[] args) {
//        - for문을 사용해서 아래처럼 출력하기
//        - ****
//          ***
//           **
//            *
        for ( int i = 0 ; i < 4 ; i++){
            for ( int j = 0 ; j <= i ; j++ ){
                System.out.print( " " );
            }
            for ( int k = 3 ; k >= i ; k-- ){
                System.out.print( "*" );
            }
            System.out.println();
        }
    }
}
