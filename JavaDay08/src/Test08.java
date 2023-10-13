import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) {
//        String타입만 저장할 수 있는 ArrayList 생성
        ArrayList<String> list = new ArrayList<String>();
        list.add( new String( "one" ) );
        list.add( "two" );
//        list.add( new Person( "홍길동", 10 ) ); // String타입이 아니므로 에러
        for ( int i = 0 ; i < list.size(); i++){
            String s = list.get( i ); // 요소를 꺼내올 때 형변환하지 않아도 된다.
            System.out.println( s );
        }
        ArrayList<Person> list1 = new ArrayList<Person>();
        list1.add( new Person( "강초당", 20 ) );
        list1.add( new Person( "장폰주", 30 ) );
        list1.add( new Person( "송몽숙", 28 ) );

        list1.set( 1, new Person( "망난이", 10 ) );

        list1.remove(2);

        for( int i = 0 ; i < list1.size(); i++ ){
            Person p = list1.get( i );
            System.out.println( p );
        }

    }
}
