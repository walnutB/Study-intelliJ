public class Test11 {
    public static void main(String[] args) {
//        for문 사용해서 1부터 100까지 수중 짝수 합과 홀수 합을 구해서 출력해 보세요
        int two = 0;
        int one = 0;
        for( int i = 1 ; i <= 100 ; i++){
            if( i % 2 ==0 ){
                two += i;
            }else{
                one += i;
            }
        }
        System.out.println( "1부터 100까지 짝수 합 : " + two );
        System.out.println( "1부터 100까지 홀수 합 : " + one );
    }
}
