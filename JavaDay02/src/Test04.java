import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
//        상품코드와 번호 받아서 당첨확인하기
        Scanner scan = new Scanner( System.in );
        System.out.println( "상품번호입력" );
        int n = scan.nextInt();
        switch(n){
            case 1:
                System.out.println( "상품 : TV" );
                System.out.println( "1등 당첨!" );break;
            case 2:
                System.out.println( "상품 : 컴퓨터" );break;
            case 3:
                System.out.println( "상품 : 냉장고" );break;
            case 4:
                System.out.println( "상품 : 스마트폰" );break;
            default:
                System.out.println( "꽝" );
        }
        System.out.println( "상품코드 입력" );
        String code = scan.next();
        switch (code){
            case "a1" :
            case "A1" :
                System.out.println( "100만원 당첨" );break;
            case "b1" :
            case "B1" :
                System.out.println( "50만원" );break;
            case "c1" :
            case "C1" :
                System.out.println( "10만원" );break;
            default:
                System.out.println( "꽝" );break;
        }

    }
}
