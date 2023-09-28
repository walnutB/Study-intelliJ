package day07_2;

import test.Shape;

public class Circle extends Shape {
    private double r;
    public Circle( int x, int y, double r ){
        super( x, y );
        this.r = r;
    }
    @Override
    public void draw(){
        System.out.println( "반지름이 " + r + "인 타원 그리기" );
    }
}
