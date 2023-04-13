import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        둘 중 더 큰 수를 구하기.
        Scanner scan = new Scanner( System.in );
        System.out.println( "두 수 입력");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int big = n1;
        if( big < n2){
            big = n2;
        }
        System.out.println( "더 큰 수는 " + big + "임" );
    }
}
