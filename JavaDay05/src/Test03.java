import java.util.Scanner;

class Square{

    private int w = 0;
    private int h = 0;

    public void input (){

        Scanner scan = new Scanner( System.in );

        System.out.println( "가로길이입력" );
        w = scan.nextInt();
        System.out.println( "세로길이입력" );
        h = scan.nextInt();

    }

    public void output(){

        System.out.println( "사각형의 넓이: " + ( this.w * this.h ) );

    }

}

public class Test03 {
    public static void main(String[] args) {

        Square sq = new Square();

        sq.input();
        sq.output();

    }
}
