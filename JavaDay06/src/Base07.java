import java.util.Calendar;

public class Base07 {
    public static void main(String[] args) {
//        public static Calendar getInstance()
        Calendar a = Calendar.getInstance();
        System.out.println( a );

        int year = a.get( Calendar.YEAR );
        int month = a.get ( Calendar.MONTH ); // 1월이면 0을 리턴 0~11
        int date = a.get ( Calendar.DAY_OF_MONTH );
        System.out.println( year + "년 " + ( month + 1 ) + "월 " + date + "일" );
        int w = a.get ( Calendar.DAY_OF_WEEK ); // 요일
        switch ( w ){
            case Calendar.SUNDAY:
                System.out.println( "일요일" ); break;
            case Calendar.MONDAY:
                System.out.println( "월요일" ); break;
            case Calendar.TUESDAY:
                System.out.println( "화요일" ); break;
            case Calendar.WEDNESDAY:
                System.out.println( "수요일" ); break;
            case Calendar.THURSDAY:
                System.out.println( "목요일" ); break;
            case Calendar.FRIDAY:
                System.out.println( "금요일" ); break;
            case Calendar.SATURDAY:
                System.out.println( "토요일" ); break;
        }
        String[] s = { "일", "월", "화", "수", "목", "금", "토" };
        System.out.println( "오늘은 " + s[ w - 1 ] + "요일입니다." );

    }
}
