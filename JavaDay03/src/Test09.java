public class Test09 {
    public static void main(String[] args) {
//        다중 while 사용해서 구구단을 출력해 보세요
//        - 출력결과
//                - [2단] 2*1=2 2*2=4 . . . 2*9=18
//                [3단]  . .
//                [9단] 9*1=9 9*2=18 9*3=27 . . . 9*9=81
        int n1 = 2;
        int n2 = 1;
        while ( n1 <=9 ){
            System.out.print( "[" + n1 + "단] " );
            while ( n2 <= 9 ){
                System.out.print( n1 + "*" + n2 + "=" + ( n1 * n2 ) + " " );
                n2++;
            }
            System.out.println();
            n1++;
            n2 = 1;
        }
    }
}
