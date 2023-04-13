public class Test09 {
    public static void main(String[] args) {
//        1부터 100까지 수 중 홀수만 출력하기
        for( int i = 1 ; i <= 100 ; i+=2 ){
            System.out.print( i + " " );
        }
        System.out.println();
        for( int i = 1 ; i <= 100 ; i++ ){
            if( i % 2 != 0){
                System.out.print( i + " " );
            }
        }
    }
}
