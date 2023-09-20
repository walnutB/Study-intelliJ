public class Base02 {
    public static void main(String[] args) {

        String s1 = "Hello";
        // public int length()
        int a = s1.length();
        System.out.println( "문자열길이: " + a );
        // public char charAt( int index )
        char b = s1.charAt( 1 );
        System.out.println( b );
        String c = s1.toUpperCase();
        System.out.println( c );
        String d = s1.substring( 1 );
        System.out.println( d );
        String s2 = "Hello World!!";
        String e = s2.substring( 6, 11 );
        System.out.println( e );

    }
}
