import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
//        아이디와 비밀번호를 입력받아 맞으면 회원님 환영합니다. 라고 출력하기
//        아이디와 비밀번호는 맞을때까지 입력한다.
        final String id = "admin";
        final String pwd = "1234a";
        Scanner scan = new Scanner( System.in );
        for( ;; ){
            System.out.println( "아이디 입력" );
            String name = scan.next();
            System.out.println( "비밀번호 입력" );
            String pass = scan.next();
            if( id.equals(name) && pwd.equals(pass) ){
                System.out.println( "회원님 환영합니다." );
                break;
            }else{
                System.out.println( "아이디 혹은 비밀번호가 틀립니다." );
            }
        }
    }
}
