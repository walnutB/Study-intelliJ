interface Animal {
    void work();
    void talk();
    default void eat(){
        System.out.println( "냠냠" );
    };
}
class Dog implements Animal{
    public void work(){
        System.out.println( "네발로 걸어가기" );
    };
    public void talk(){
        System.out.println( "멍멍" );
    };
    public void shake(){
        System.out.println( "꼬리흔들기" );
    };
}
class Human implements Animal{
    public void work(){
        System.out.println( "두발로 걸어가기" );
    };
    public void talk(){
        System.out.println( "말하기" );
    };
    public void study(){
        System.out.println( "공부하기" );
    };
    @Override
    public void eat() { System.out.println( "쩝쩝쩝..." );
    }
}
public class Test03 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
        d.talk();
        d.shake();
        d.eat();
        Animal a = new Human();
        a.work();
        a.talk();
        Human m = ( Human ) a;
        m.study();
        m.eat();
    }
}
