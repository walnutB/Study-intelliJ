import java.util.ArrayList;

class Member{
    private String id;
    private String pwd;
    private String mail;
    public Member( String id, String pwd, String mail ){
        this.id = id;
        this.pwd = pwd;
        this.mail = mail;
    }
    public void print(){
        System.out.println( "아이디: " + id + ", 비밀번호: " + pwd + ", 이메일: " + mail );
    }
}
public class Test12 {
    public static void main(String[] args) {
        ArrayList< Member > list = new ArrayList< Member >();
        list.add( new Member( "abc", "1234", "11@111" ) );
        list.add( new Member( "def", "567", "22@222" ) );
        list.add( new Member( "ghi", "89", "33@333" ) );
        for ( int i = 0 ; i < list.size(); i++ ){
            Member m = list.get( i );
            m.print();
        }
    }
}
