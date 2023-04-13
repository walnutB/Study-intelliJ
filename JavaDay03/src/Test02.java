public class Test02 {
    public static void main(String[] args) {
//        다중for를 사용해서 구구단 출력하기(가로)
//                [2단] 2*1=2 2*2=4 ... 2*9=18
//                [3단] 3*1=3 .. 3*9=27
        for( int i = 2 ; i <= 9 ; i++ ){
            System.out.print( "[" + i + "단] ");
            for( int j = 1 ; j <= 9 ; j++ ){
                System.out.print( i + "*" + j + "=" + (i*j) + " " );
            }
            System.out.println();
        }
    }
}
