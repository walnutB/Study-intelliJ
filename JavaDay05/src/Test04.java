class MyCircle{

    private double r ;
    public MyCircle(){
        this.r = 50;
    }
    public MyCircle( double r ){

        this.r = r;

    }
    public void showArea(){
        System.out.println( "반지름: " + r );
        System.out.println( "원의 넓이 : " + ( r * r * 3.14 ) );
    }

}
public class Test04 {

    public static void main(String[] args) {

        MyCircle mc = new MyCircle();
        mc.showArea();

        MyCircle mm = new MyCircle( 10.5 );
        mm.showArea();

    }


}
