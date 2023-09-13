public class Base05 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = sum ( a, b );
        System.out.println( "두 수 합: " + c );

    }
    public static int sum ( int x, int y ){

        int c = x + y;
        return c;

    }
}
