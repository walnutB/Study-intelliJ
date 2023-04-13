public class Test07 {
    public static void main(String[] args) {
//        1부터 100까지 수 중 3의 배수 출력하고 3의 배수합 출력해 보세요
        int n1 = 1;
        int n2 = 0;
        while( n1 <= 100 ){
            if( n1 % 3 == 0 ){
                System.out.print( n1 + " " );
                n2 += n1;
            }
            n1++;
        }
        System.out.println( "1부터 100까지 중 3의 배수의 합 : " + n2 );
    }
}
