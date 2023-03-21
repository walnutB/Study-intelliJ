import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
//        두 정수를 입력받아 더 큰 수를 출력하기
        Scanner scan = new Scanner(System.in);
        System.out.println( "정수 1 입력" );
        int n1 = scan.nextInt();
        System.out.println( "정수 2 입력" );
        int n2 = scan.nextInt();
        int n3 = n1>n2?n1:n2;
        System.out.println( n3 + "이 더 큰 수이다" );
        System.out.println(n1>n2?n1:n2 + "이 더 큰 수임");
    }
}
