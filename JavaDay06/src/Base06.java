class MyCircle{
    public static final double PI = 3.141592;

    public void area ( double r ){
        System.out.println( "원의 넓이: " + r * r * PI );
    }
}

public class Base06 {
    public static void main(String[] args) {
//        final double PI = 3.141592;
//        System.out.println( "pi: " + PI );
//        // PI = 3.4; <- final이 붙어있으므로 값을 변경못함
//        final String RED = "rgb( 255, 0, 0 ) ";
        MyCircle mc = new MyCircle();
        mc.area( 10 );

        System.out.println( 10 * 10 * MyCircle.PI );
    }
}
