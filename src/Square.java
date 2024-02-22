public class Square implements IShape {
    private int side = 0;

    public Square(int side) {
        this.side = side;
    }

    public double area() {
        return this.side * this.side;
    }

    @Override
    public int compareTo(IShape o) {
        return (int) (this.area() - o.area());
    }
}
