import java.util.ArrayList;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner( System.in );
        while ( true ){
            System.out.println( "학생이름입력 (종료:exit)" );
            String name = scan.next();
            if ( name.equals("exit") ) break;
            list.add( name );
        }
        System.out.println( "<저장된 학생이름>" );
        for ( int i = 0 ; i < list.size() ; i++){
            String n = list.get( i );
            System.out.println( n );
        }
    }
}
