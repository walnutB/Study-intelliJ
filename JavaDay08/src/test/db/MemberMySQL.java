package test.db;

public class MemberMySQL implements Member{
    public void conn(){
        System.out.println( "MySQL db접속..." );
    }
    public void insert( String mem ){
        System.out.println( "MySQL명령어를 사용해서 " + mem + " 회원추가" );
    }
    public void select( String mem ){
        System.out.println( "MySQL명령어를 사용해서 " + mem + " 회원조회" );
    }
    public void update( String mem ){
        System.out.println( "MySQL명령어를 사용해서 " + mem + " 회원수정" );
    }
    public void delete( String mem ){
        System.out.println( "MySQL명령어를 사용해서 " + mem + " 회원삭제" );
    }
    public void disconn(){
        System.out.println( "MySQLdb연결 종료...." );
    }
}
