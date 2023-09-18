
class Font {

    private int fontSize;
    private String fontName;

    public Font(){

//        System.out.println( "Font생성자호출됨......" );
        fontSize = 10;
        fontName = "바탕체";

    }

    public Font ( int fontSize, String fontName ){

        this.fontSize = fontSize;
        this.fontName = fontName;

    }

    public void setFontSize( int fontSize ){

        this.fontSize = fontSize;

    }

    public void setFontName ( String fontName ){

        this.fontName = fontName;

    }

    public void showFontInfo(){

        System.out.println( "설정된 글꼴크기:" + fontSize );
        System.out.println( "설정된 글꼴체: " + fontName );

    }

}

public class Base04 {

    public static void main(String[] args) {

        Font f = new Font();
        f.showFontInfo();
        f.setFontName( "궁서체" );
        f.showFontInfo();

        Font fi = new Font( 20, "굴림체" );
        fi.showFontInfo();

    }
}
