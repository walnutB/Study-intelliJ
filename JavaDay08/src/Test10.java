import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        Scanner scan = new Scanner( System.in );
        list.add( new Book( 1, "자바", 23000 ) );
        list.add( new Book( 2, "스프링", 15000 ) );
        list.add( new Book( 3, "vue", 20000 ) );
        System.out.println( "< 전체 도서목록 >" );
        for( int i = 0 ; i < list.size(); i++ ){
            Book b = list.get( i );
            b.print();
        }
        System.out.print( "도서번호: " );
        int num = scan.nextInt();
        Boolean find = false;
        for( int i = 0 ; i < list.size() ; i++ ){
            Book bk = list.get( i );
            if ( num == bk.getNum() ) {
                System.out.println( "< 조회된 도서 정보 >" );
                bk.print();
                find = true;
                break;
            }
        }
        if ( !find ) System.out.println( "찾는 도서가 없습니다." );
        System.out.println( "삭제할 도서번호 입력" );
        num = scan.nextInt();
        find = false;
        for( int i = 0 ; i < list.size() ; i++ ){
            Book bk = list.get( i );
            if ( num == bk.getNum() ) {
                Book b = list.remove( i );
                System.out.println( "< 삭제된 도서 정보 >" );
                bk.print();
                find = true;
                break;
            }
        }
        if ( !find ) System.out.println( "삭제될 도서번호가 존재하지 않습니다." );
        System.out.println( "< 전체 도서정보 출력 >" );
        for( int i = 0 ; i < list.size(); i++ ){
            Book bk = list.get( i );
            bk.print();
        }
    }
}
