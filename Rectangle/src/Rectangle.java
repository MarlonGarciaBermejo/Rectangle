public class Rectangle {
    double x;
    double y;
    double width;
    double heigth;

    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.heigth = 0;
    }

    public Rectangle(double width, double heigth) {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.heigth = 0;
    }
    public Rectangle(double width, double heigth, double x, double y) {
        this.x = x;
        this.y = y;
        this.heigth = heigth;
        this.width = width;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }


    public double calculateArea(double width, double heigth) {
        return width * heigth;
    }

    public double calculatePerimeter(double width, double heigth) {
        return (width * 2) + (heigth *2);
    }
}


