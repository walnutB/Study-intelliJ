public class Test06 {
    public static void main(String[] args) {
//        증감연산자 결과 예측 후 실행하기
        int a = 5, b = 5,c = 5;
        int d = ++a + b;
        int e = b-- + 10;
        int f = c++ + b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("d:" + d);
        System.out.println("e:" + e);
        System.out.println("f:" + f);
    }
}
