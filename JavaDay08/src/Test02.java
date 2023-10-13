import test.db.Member;
import test.db.MemberMySQL;
import test.db.MemberOracle;
public class Test02 {
    public static void main(String[] args) {
//        MemberOracle mem = new MemberOracle();
        Member mem = new MemberMySQL();
        mem.conn();
        mem.insert( "홍길동1" );
        mem.select( "홍길동2" );
        mem.update( "홍길동3" );
        mem.delete( "홍길동4" );
    }
}
