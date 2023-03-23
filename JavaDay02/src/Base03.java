public class Base03 {
    public static void main(String[] args) {
        char b = 'a';
        for( ;; ){
            System.out.print( b + " " );
            b++;
            if( b > 'z')break;
        }
    }
}
