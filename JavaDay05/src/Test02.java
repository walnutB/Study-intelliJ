import java.util.Scanner;

class Student{

    private int num;
    private int kor;
    private int math;
    private int tot;
    public void input(){

        Scanner scan = new Scanner( System.in );

        System.out.println( "학생번호:" );
        num = scan.nextInt();
        System.out.println( "국어점수:" );
        kor = scan.nextInt();
        System.out.println( "수학점수:" );
        math = scan.nextInt();

    }
    public void calc(){

        tot = kor + math;

    }

    public void output(){

        System.out.println( "학생번호: " + num );
        System.out.println( "국어점수: " + kor );
        System.out.println( "수학점수: " + math );
        System.out.println( "총점: " + tot );

    }

}

public class Test02 {

    public static void main(String[] args) {

        Student stu = new Student();
        stu.input();
        stu.calc();
        stu.output();

    }
}
