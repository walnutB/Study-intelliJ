import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
//        임의의 정수를 입력받아 절대값을 구해보세요.(if문 사용)
        Scanner scan = new Scanner( System.in );
        System.out.println( "정수입력" );
        int n = scan.nextInt();
        int a = 0;
        if( n < 0){
            a = -n;
        }else{
            a = n;
        }
        System.out.println( n + "의 절대값은 " + a );
    }
}
