
class Book{
    private String title;
    private int price;
    public Book ( String title, int price ){

        this.title = title;
        this.price = price;

    }

    public void showInfo(){

        System.out.println( "도서제목: " + title );
        System.out.println( "도서가격: " + price + "원" );

    }

}
public class Test05 {

    public static void main(String[] args) {

        Book bo = new Book( "자라투스트라", 3000 );
        bo.showInfo();

    }
}
