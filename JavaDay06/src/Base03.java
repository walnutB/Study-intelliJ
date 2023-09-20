class Math1{

    int a;
    int b;
    public int add( int x, int y ){
        return x + y;
    }
    public static int max( int x, int y ){
//        a = x + y;
        return x > y ? x : y;
    }
}
public class Base03 {

    public static void main(String[] args) {

        Math1 m = new Math1();
        int n = m.add( 1, 2 );
        System.out.println( n );

        int n2 = Math1.max ( 1, 2 );
        System.out.println( "큰값: " + n2 );

    }



}
