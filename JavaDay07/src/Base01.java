class HandPhone{
    private String phoneNum;
    public void setPhoneNum( String phoneNum ){
        this.phoneNum = phoneNum;
    }
    public void call(){
        System.out.println( "내 핸드폰 번호:" + phoneNum );
        System.out.println( "전화걸기....." );
    }
}
class Dicaphone extends HandPhone{
    private int pixel; //화소수
    public void setPixel( int pixel ){
        this.pixel = pixel;
    }
    public void picture(){
        System.out.println( pixel + "만 화소..." );
        System.out.println( "사진찍기" );
    }
}
public class Base01 {
    public static void main(String[] args) {
        Dicaphone dp = new Dicaphone();
        dp.setPhoneNum( "01011111234" );
        dp.setPixel( 100000 );
        dp.call();
        dp.picture();
    }

}
