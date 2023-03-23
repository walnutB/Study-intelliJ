import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
//        두 정수와 사칙연산자(+,-,*,/)중 하나를 입력받아 해당 연산이 수행되도록 하기-switch
        Scanner scan = new Scanner( System.in);
        System.out.println( "첫번째 정수 입력" );
        int n1 = scan.nextInt();
        System.out.println( "두번째 정수 입력" );
        int n2 = scan.nextInt();
        System.out.println( "연산자 입력(+,-,*,/)" );
        String mid = scan.next();
        switch (mid){
            case "+" :
                System.out.println( n1 + "+" + n2 + "=" + (n1 + n2) );break;
            case "-" :
                System.out.println( n1 + "-" + n2 + "=" + (n1 - n2) );break;
            case "*" :
                System.out.println( n1 + "*" + n2 + "=" + (n1 * n2) );break;
            case "/" :
                System.out.println( n1 + "/" + n2 + "=" + (n1 / n2) ); break;
            default:
                System.out.println( "정해진 연산자를 입력하세요" );
        }

    }
}
