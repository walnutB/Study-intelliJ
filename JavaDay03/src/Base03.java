public class Base03 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 0;
        while( n1 <= 100 ){
            n2 += n1++;
        }
        System.out.println( n2 );

        int sum = 0;
        int i = 1;
        while ( i <= 100 ){
            sum += i;
            i++;
        }
        System.out.println( "1부터 100까지의 합: " + sum );

    }
}
