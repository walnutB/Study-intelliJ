import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
//        다섯명 학생의 점수를 입력받아 전체 총점과 평균을 구해보세요.
        Scanner scan = new Scanner( System.in );
        System.out.print( "학생 1의 점수 : " );
        int stu1 = scan.nextInt();
        System.out.print( "학생 2의 점수 : " );
        int stu2 = scan.nextInt();
        System.out.print( "학생 3의 점수 : " );
        int stu3 = scan.nextInt();
        System.out.print( "학생 4의 점수 : " );
        int stu4 = scan.nextInt();
        System.out.print( "학생 5의 점수 : " );
        int stu5 = scan.nextInt();
        int tot = stu1 + stu2 + stu3 + stu4 + stu5;
        double ave = tot / 5.0;
        System.out.println( "학생 전체 총점 : " + tot + ", 학생 전체 평균 : " + ave );
    }
}
