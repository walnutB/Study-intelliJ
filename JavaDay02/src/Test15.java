public class Test15 {
    public static void main(String[] args) {
//        1부터 100까지 수를 모두 출력하시오. 단 한줄에 10개씩 출력하세요
        for( int i = 1 ; i <= 100; i++ ){
            System.out.print( i + " " );
            if( i % 10 == 0){
                System.out.println();
            }
        }
    }
}
