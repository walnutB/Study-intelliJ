package day07_1;
class HandPhone{
    private String phoneNum;
    public HandPhone( String phoneNum ){
        this.phoneNum = phoneNum;
    }
    public void call(){
        System.out.println( "내 핸드폰 번호:" + phoneNum );
        System.out.println( "전화걸기....." );
    }
}
class Dicaphone extends HandPhone {
    private int pixel; //화소수
    public Dicaphone( String phoneNum, int pixel ){
        super( phoneNum );
        this.pixel = pixel;
    }
    public void picture(){
        System.out.println( "사진찍기...." );
    }
}
// HandPhone을 상속받아 사진찍는 기능이 추가되는 Dicaphone클래스를 만들고 메인에소드에서 사용하기
public class Base04 {
    public static void main(String[] args) {
        Dicaphone dc = new Dicaphone( "010223655", 2000000 );
        dc.call();
        dc.picture();
    }
}
