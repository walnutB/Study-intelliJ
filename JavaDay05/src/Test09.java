import java.util.Scanner;

class Salary{
    private int num;
    private String name;
    private String depart;
    private int salary;
    private int bonus;
    public Salary(){}
    public void input(){
        Scanner scan = new Scanner( System.in );
        System.out.print( "사원번호: " );
        num = scan.nextInt();
        System.out.print( "이름: " );
        name = scan.next();
        System.out.print( "부서: " );
        depart = scan.next();
        System.out.print( "본봉: " );
        salary = scan.nextInt();
        System.out.print( "수당: " );
        bonus = scan.nextInt();
    }
    public int getSal(){

        return salary + bonus;

    }

    public void printSal(){

        System.out.println( "사원번호: " + num );
        System.out.println( "이름: " + name );
        System.out.println( "부서: " + depart );
        System.out.println( "본봉: " + salary );
        System.out.println( "수당: " + bonus );
        System.out.println( "급여: " + getSal() + "만원" );

    }

}
public class Test09 {
    public static void main(String[] args) {
//        - 사원번호, 이름, 부서, 본봉, 수당을 입력받아 출력하는 클래스를 만들기
//        - 급여는 본봉 + 수당
//        - [출력결과]
//        사원번호:10
//        이름:홍길동
//        부서:영업부
//        본봉:1000000
//        수당:500000
//        급여:1500000 만원
        Salary sal = new Salary();
        sal.input();
        sal.printSal();
    }
}
