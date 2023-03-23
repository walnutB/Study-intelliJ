import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
//        switch 문 if 코드로 바꿔보기
        System.out.println( "상품 코드 입력" );
        Scanner scan = new Scanner( System.in );
        String code = scan.next();
        if ( code.equals( "a1" ) || code.equals( "A1" )){
            System.out.println( "100만원 당첨!" );
        }else if( code.equals( "b1" ) || code.equals( "B1" )){
            System.out.println( "50만원 당첨!" );
        }else if( code.equals( "c1" ) || code.equals( "C1" ) ){
            System.out.println( "10만원 당첨!" );
        }else{
            System.out.println( "꽝" );
        }


    }
}
