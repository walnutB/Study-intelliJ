import java.util.Calendar;

public class Test10 {
    public static void main(String[] args) {
//        Calendar 클래스를 사용해서 오늘 날짜와 현재 시간 (시, 분, 초)를 출력하기

        Calendar a = Calendar.getInstance();
        int year = a.get( Calendar.YEAR );
        int month = a.get ( Calendar.MONTH ); // 1월이면 0을 리턴 0~11
        int date = a.get ( Calendar.DAY_OF_MONTH );
        System.out.println( year + "년 " + ( month + 1 ) + "월 " + date + "일" );
//        int hour = a.get( Calendar.HOUR_OF_DAY ); //24시간 단위
        int hour = a.get( Calendar.HOUR ); // 12시간 단위
        int mi = a.get( Calendar.MINUTE );
        int sec = a.get( Calendar.SECOND );
        int ampm = a.get( Calendar.AM_PM ); // 오전이면 0 오후면 1
        String ap = "오후";
        if ( ampm == Calendar.AM ) {
            ap = "오전";
        }
        System.out.println( ap + " " + hour + "시 " + mi + "분 " + sec + "초"  );

    }
}
