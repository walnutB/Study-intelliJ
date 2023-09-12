import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {

//        학생답안 10개를 입력받아 학생의 점수 출력하기
//        - 정답 : int[] dap={1,2,3,4,2,3,4,1,1,4};
//        - 학생답입력
//        1,1,2,4,2,3,4,1,1,4
//        학생점수:80점

        int[] dap= {1,2,3,4,2,3,4,1,1,4}; //정답
        int[] sdap=new int[10]; //학생답
        char[] ox=new char[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("학생답안 10개 입력");
        int score=0;
        for(int i=0;i<sdap.length;i++) {
            System.out.println((i+1)+"번 답");
            sdap[i]=scan.nextInt();
            if(dap[i]==sdap[i]) {
                score += 10;
                ox[i]='o';
            }else {
                ox[i]='x';
            }
        }
        System.out.println("<< 입력된 학생 답안 >>");
        for(int i=0;i<sdap.length;i++) {
            System.out.print(sdap[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ox.length;i++) {
            System.out.print(ox[i]+" ");
        }
        System.out.println();
        System.out.println("점수:"+score);

//        위 프로그램에서 학생의 답을 출력하고 채점표 출력하기

    }

}
