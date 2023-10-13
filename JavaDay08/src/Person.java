public class Person {
    private String name;
    private int age;
    public Person( String name, int age){
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println( "이름: " + name );
        System.out.println( "나이: " + age );
    }
    @Override
    public String toString(){
        return "이름: " + name + ", 나이: " + age;
    }
}
