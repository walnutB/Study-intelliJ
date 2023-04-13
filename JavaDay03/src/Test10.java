public class Test10 {
    public static void main(String[] args) {
//        다중 while 사용해서 알파벳 출력하기
//        - 출력결과
//            - A
//            AB
//            ABC
//            ABCD
//            ABCDE
        char a = 'A';
        while( a <= 'Z' ){
            char z = 'A';
            while( z <= a ){
                System.out.print( z++ );
            }
            a++;
            System.out.println();
        }
    }

}
