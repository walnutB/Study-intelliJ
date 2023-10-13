import java.util.Scanner;

interface MyArea1{
    void input();//데이터 키보드로 입력받는 기능
    void printArea();//넓이 구해서 출력하는 기능
}
class Rect3 implements MyArea1{
    private int h;
    private int w;
    @Override
    public void input() {
        Scanner scan = new Scanner( System.in );
        System.out.println( "높이 입력" );
        h = scan.nextInt();
        System.out.println( "가로 입력" );
        w = scan.nextInt();
    }
    @Override
    public void printArea() {
        System.out.println( "해당 사각형의 넓이는: " + h * w );
    }
}
public class Test11 {
    public static void main(String[] args) {
        Rect3 r = new Rect3();
        r.input();
        r.printArea();
    }
}
