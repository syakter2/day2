public class Rectangle implements Shape {

    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateArea() {
        return this.x * this.y;
    }

    @Override
    public void display() {
        System.out.println("The area of the rectangle is " + calculateArea());
    }

}
