public class Base03 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        int c = b++;
        System.out.println( a );
        System.out.println( b );
        System.out.println( c );

        int a1 = 10, b1 = 10, c1 = 10, d1 = 0, d2 = 0;
        d1 = ++a1 + 10;
        d2 = b1++ + a1 + c1--;
        System.out.println("a1: "+a1);
        System.out.println("b1: "+b1);
        System.out.println("c1: "+c1);
        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
    }
}
