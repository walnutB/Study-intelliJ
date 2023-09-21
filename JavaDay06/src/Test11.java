import java.util.Calendar;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "연도입력" );
        int year = scan.nextInt();
        System.out.println( "월입력" );
        int month = scan.nextInt();
        System.out.println( "날짜입력" );
        int date = scan.nextInt();
        Calendar a = Calendar.getInstance();
        a.set ( year, month - 1, date );
        int day =  a.get ( Calendar.DAY_OF_WEEK );
        String[] d = { "일", "월", "화", "수", "목", "금", "토" };

        System.out.println( d[ day - 1 ] + "요일" );

    }

}
