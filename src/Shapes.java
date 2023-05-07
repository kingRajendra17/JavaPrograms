abstract class Shape {
    abstract void area();
}

class Square extends Shape {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {  
        this.length = length;
    }

    @Override
    void area() {
        int area = length * length;
        System.out.println("Area of Square is: " + area);
    }

    void getArea() {
        this.setLength(25);
        this.area();
        System.out.println();
    }
}

class Rectangle extends Square {
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    void getArea() {
        super.getArea();
        this.setLength(35);
        this.setWidth(78);
        int area = this.getLength() * this.getWidth();
        System.out.println("Area of Rectangle is: " + area);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape square = new Square();
        square.area();

        Square rect = new Rectangle();
        rect.getArea();
    }
}
