import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add( "홍길동" );
        list.add( "이길동" );
        list.add( "삼길동" );

        for ( int i = 0 ; i < list.size(); i++ ){
            Object a = list.get( i );
            System.out.println( a );

        }

    }
}
