
import test.Test08;

import static test.Test08.*;
class MyClass1{
    private String userName;
    private static String serverIp;

    static { //static멤버 초기화하기
        System.out.println( "서버아이피주소를 설정합니다..." );
        serverIp = "localhost";
    }
    public MyClass1(){
        userName = "admin";
    }
    public String getUserName() {
        return userName;
    }
    public static String getServerIp() {
        return serverIp;
    }
}
public class Base05 {
    public static void main(String[] args) {
        MyClass1 mc = new MyClass1();
        System.out.println( "username: " + mc.getUserName() );
        System.out.println( "db서버: " + MyClass1.getServerIp() );
        MyClass1 mc1 = new MyClass1();

        System.out.println( "두 수 합: " + Test08.add( 1, 2 ) );
        System.out.println( "두 수 합: " + add ( 1, 2 ) );
        System.out.println( "두 수 차: " + sub ( 1, 2 ) );
    }
}
