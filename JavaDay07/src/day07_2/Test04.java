package day07_2;

import java.util.Date;

class Member{
    private String id;
    private String pwd;
    public Member( String id, String pwd ){
        this.id = id;
        this.pwd = pwd;
    }
    public String getId() {
        return id;
    }
    public String getPwd() {
        return pwd;
    }
    @Override
    public String toString(){
        String s = "아이디: " + id + ", 비밀번호: " + pwd;
        return s;
    }
    @Override
    public boolean equals( Object obj ){
        Member m = ( Member ) obj;
        if ( id == m.getId() && pwd == m.getPwd() ){
            return true;
        }else{
            return false;
        }
    }
}
public class Test04 {
    public static void main(String[] args) {
        Member m = new Member( "test1", "1234" );
        Member m1 = new Member( "test1", "1234" );
        System.out.println( m.getId() + ", " + m.getPwd() );
//        public String toString()
        System.out.println( m );

        String s1 = new String( "hello" );
        // toString메소드를 오버라이딩함
        String s2 = s1.toString();
        System.out.println( s2 );
        Date d = new Date();
        System.out.println( d.toString() );
        System.out.println( m.toString() );

        if( m.equals( m1 ) ){
            System.out.println( "같은 회원입니다." );
        } else {
            System.out.println( "다른 회원입니다." );
        }

    }
}
