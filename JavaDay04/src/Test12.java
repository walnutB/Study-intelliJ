public class Test12 {

    public static void main(String[] args) {

//        배열합을 구하는 getSum 메소드를완성해보세요
        int[] a = { 10, 20, 30, 40, 50 };
        int sum = getSum ( a );
        System.out.println( "배열합: " + sum );

    }

    public static int getSum ( int[] a ){

        int b = 0;

        for ( int i = 0; i < a.length ; i++ ){

            b += a [ i ];

        }
        return b;

    }
}
