public class Test04 {
    public static void main(String[] args) {
//        다중for를 사용해서 알파벳 출력하기
//                A
//                AB
//                ABC
//                ABCD
//                ABCDE
        for( char i = 'A' ; i <= 'Z' ; i++ ){
            for( char j = 'A' ; j <= i ; j++ ){
                System.out.print( j );
            }
            System.out.println();
        }
    }
}
