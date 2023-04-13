public class Test03 {
    public static void main(String[] args) {
//        다중for를 사용해서 구구단 출력하기(세로)
//                2*1=2 3*1=3 ............ 9*1=9
//                2*2=4 3*2=6 ..............9*2=18
        for( int i = 1 ; i <= 9 ; i++ ){
            for( int j = 2 ; j <= 9 ; j++ ){
                System.out.print( j + "*" + i + "=" + (j*i) + " " );
            }
            System.out.println();
        }
    }
}
