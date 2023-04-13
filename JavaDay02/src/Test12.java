public class Test12 {
    public static void main(String[] args) {
//        1부터 100까지 수중 3의 배수를 출력하고 3의 배수합도 구해서 출력해 보세요
        int hap = 0;
        for( int i = 3 ; i <= 100 ; i++ ){
            if( i % 3 == 0){
                System.out.print( i + " ");
                hap += i;
            }
        }
        System.out.println( "3의 배수합 : " + hap );
    }
}
