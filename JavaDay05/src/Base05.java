public class Base05 {

    public static void main(String[] args) {
        Member[] m = new Member[ 3 ];
        m[ 0 ] = new Member( "admin", "1234" );
        m[ 1 ] = new Member( "hello", "2222" );
        m[ 2 ] = new Member( "user1", "3333" );
        for ( int i = 0 ; i < m.length; i++ ){

            System.out.println( "회원아이디: " + m[ i ].getId() );
            System.out.println( "비밀번호: " + m[ i ].getPwd() );

        }

    }
}
