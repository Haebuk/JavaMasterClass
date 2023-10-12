public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        int diffX = this.x - x;
        int diffY = this.y - y;

        return Math.sqrt(((diffX * diffX) + (diffY * diffY)));
    }

    public double distance(Point p) {
        int px = p.getX();
        int py = p.getY();

        return distance(px, py);
    }

}
