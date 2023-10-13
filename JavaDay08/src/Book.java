public class Book {
    private int num; //도서번호
    private String title;
    private int price;
    public Book( int num, String title, int price ){
        this.num = num;
        this.title = title;
        this.price = price;
    }
    public int getNum() {
        return num;
    }
    public String getTitle() {
        return title;
    }
    public int getPrice() {
        return price;
    }
    public void print(){
        System.out.println( "도서번호: " + num );
        System.out.println( "도서제목: " + title );
        System.out.println( "도서가격: " + price );
    }
}
