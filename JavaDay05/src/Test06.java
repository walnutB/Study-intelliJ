class Member{
    private String id;
    private String pwd;
    public Member( String id, String pwd ){

        this.id = id;
        this.pwd = pwd;

    }
    public void editInfo( String id, String pwd ){

        this.id = id;
        this.pwd = pwd;

    }
    public String getId(){

        return id;

    }
    public String getPwd(){

        return pwd;

    }

}
public class Test06 {
    public static void main(String[] args) {

        Member mb = new Member ( "abcd", "1234" );
        String id = mb.getId();
        String pwd = mb.getPwd();
        System.out.println( "id: " + id + ", pwd: " + pwd );

        printMember( mb );

    }
    public static void printMember ( Member a ){

        System.out.println( "method............" );
        System.out.println( "id: " + a.getId() + ", pwd: " + a.getPwd() );

    }

}
