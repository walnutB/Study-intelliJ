import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "아이디 입력" );
        String id = scan.next();
        System.out.println( "비밀번호 입력" );
        String pwd = scan.next();
        if( id.equals("abc")){
            if( pwd.equals("1234") ){
                System.out.println( "로그인을 환영합니다." );
            }else {
                System.out.println( "비밀번호를 잘못 입력했습니다." );
            }
        }else{
            System.out.println( "존재하지 않는 아이디입니다." );
        }
    }
}
