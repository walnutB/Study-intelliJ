
class Calculator{
    public static int add ( int a, int b ){
        return a + b;
    }
    public static int sub ( int a, int b ){
        return a - b;
    }
    public static int mul ( int a, int b ){
        return a * b;
    }
    public static double div ( int a, int b ){
        return a / b;
    }

}
public class Test05 {
    public static void main(String[] args) {

        System.out.println( "더하기: " + Calculator.add( 1, 2 ) );
        System.out.println( "뻬기: " + Calculator.sub( 1, 2 ) );
        System.out.println( "곱하기: " + Calculator.mul( 1, 2 ) );
        System.out.println( "나누기: " + Calculator.div( 1, 2 ) );

    }

}
