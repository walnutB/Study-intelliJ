class Person{
    private String snum;
    private String name;
    public void setPerson( String snum, String name ){
        this.snum = snum;
        this.name = name;
    }
    public void printPerson(){
        System.out.println( "주민등록번호: " + snum );
        System.out.println( "이름: " + name );
    }
}
class Student extends Person {
    private int num;
    private String major;
    public void setStudent( int num, String major ){
        this.num = num;
        this.major = major;
    }
    public void setAll( String snum, String name, int num, String major){
        setPerson( snum, name );
        this.num = num;
        this.major = major;
    }
    public void printStudent(){
        System.out.println( "학생번호: " + num );
        System.out.println( "전공: " + major );
    }
    public void printAll(){
//        System.out.println( "주민등록번호: " + snum );
//        System.out.println( "이름: " + name );
        printPerson();
        System.out.println( "학생번호: " + num );
        System.out.println( "전공: " + major );

    }
}
public class Base02 {
    public static void main(String[] args) {
//        Student 객체를 생성하고 사용하기

        Student s = new Student();
        s.setPerson( "11111", "초당" );
        s.setStudent( 111, "kor" );
        s.printAll();
//        s.printPerson();
//        s.printStudent();
    }
}
