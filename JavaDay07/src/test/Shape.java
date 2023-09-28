package test;
public class Shape{
    protected int x;
    protected int y;
    public Shape( int x, int y ){
        this.x = x;
        this.y = y;
    }
    public void printXY(){
        System.out.println( "x: " + x );
        System.out.println( "y: " + y );
    }
    public void draw(){
        System.out.println("도형그리기");
    }
}