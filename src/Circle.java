public class Circle implements IShape {
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (this.radius * this.radius) * Math.PI;
    }

    @Override
    public int compareTo(IShape o) {
        return (int) (this.area() - o.area());
    }
}
