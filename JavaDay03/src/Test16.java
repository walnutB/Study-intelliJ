public class Test16 {
    public static void main(String[] args) {
//        - for문을 사용해서 아래처럼 출력하기
//        - System.out.print(" ");
//        System.out.print("*");
//        - *
//        **
//       ***
//      ****
//     *****
        for ( int i = 0 ; i < 5 ; i++ ){
            for ( int j = 5 ; j > i ; j-- ){
                System.out.print( " " );
            }
            for ( int k = 0 ; k <= i  ; k++ ){
                System.out.print( "*" );
            }
            System.out.println();
        }
    }
}
