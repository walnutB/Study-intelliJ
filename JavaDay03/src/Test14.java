public class Test14 {
    public static void main(String[] args) {
//        - 1부터 50까지 수 중에서 모든 소수를 출력하기
//        - 출력결과 > 2 3 5 7 ... 47

        for ( int i = 1 ; i <= 50 ; i++ ){
            boolean isPrime = true;
            for ( int j = 2 ; j < i ; j++ ){
                if ( i % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if ( isPrime ) System.out.print( i + " " );

        }
    }
}
