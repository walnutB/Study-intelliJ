import java.util.Scanner;

public class base02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "정수 입력 1" );
        int n1 = scan.nextInt();
        System.out.println( "정수 입력 2" );
        int n2 = scan.nextInt();
        int n3 = n1 + n2;
        System.out.println( "입력받은 두 수의 합 : " + n3);
        System.out.println( "이름 입력하기" );
        String name = scan.next();
        System.out.println( "이름 : " + name);
    }
}
