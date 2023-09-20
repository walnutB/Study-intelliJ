public class Test02 {
    public static void main(String[] args) {

//        public String(byte[] bytes) 생성자를 이용해서 byte 배열을 문자열로 출력되도록 하기
//        출력결과
//        ABCDE

        byte[] bb = { 65, 66, 67, 68, 69 };
        String s1 = new String( bb );
        System.out.println( s1 );
    }
}
