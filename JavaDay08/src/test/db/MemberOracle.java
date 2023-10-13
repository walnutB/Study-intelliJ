package test.db;

public class MemberOracle implements Member{
    public void conn(){
        System.out.println( "오라클 db접속..." );
    }
    public void insert( String mem ){
        System.out.println( "오라클명령어를 사용해서 " + mem + " 회원추가" );
    }
    public void select( String mem ){
        System.out.println( "오라클명령어를 사용해서 " + mem + " 회원조회" );
    }
    public void update( String mem ){
        System.out.println( "오라클명령어를 사용해서 " + mem + " 회원수정" );
    }
    public void delete( String mem ){
        System.out.println( "오라클명령어를 사용해서 " + mem + " 회원삭제" );
    }
    public void disconn(){
        System.out.println( "오라클db연결 종료...." );
    }
}
