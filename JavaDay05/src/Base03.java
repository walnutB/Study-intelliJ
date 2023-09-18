
class Box{

    int w ; //가로길이
    int h ; //세로길이
    String color; //내부색상
    public void setData ( int w, int h, String color ){

        this.w = w;
        this.h = h;
        this.color = color;

    }
    public void draw(){

        System.out.println( w + "," + h + "크기의 사각형 그리기" );

    }
    public void paint(){

        System.out.println( color + "색으로 사각형 칠하기" );

    }

}

public class Base03 {

    public static void main(String[] args) {

        Box b = new Box();
        b.setData( 100, 200, "red" );
        b.draw();
        b.paint();


    }
}
