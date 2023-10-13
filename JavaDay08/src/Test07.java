import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Person per1 = new Person( "홍길동", 10 );
        Person per2 = new Person( "이순희", 20 );
        list.add( per1 );
        list.add( per2 );
        for( int i = 0 ; i < list.size() ; i++ ){
            Object a =  list.get( i );
//            Person p = ( Person ) a;
//            p.print();
            System.out.println( a );
        }
    }
}
