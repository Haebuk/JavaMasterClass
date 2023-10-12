public class Wall {

    private double height;
    private double width;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.height = height < 0 ? 0 : height;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
