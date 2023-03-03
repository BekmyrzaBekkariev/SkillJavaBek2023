package src6.l6l1.figures;

public class Square extends Rectange {

    public Square(int width, int height) {
        super(width, height);
        if ( width != height) {
            System.out.println("The width doesn't equals the height");
        }
    }
    public Square(int width) {
        super(width, width);
    }

    public void setWidth(int width) {
        this.width = width;
        height = width;
    }
    public void setHeight(int height) {
        this.height = height;
        width = height;
    }
}
