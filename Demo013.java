public class Demo013 {
    private double base;
    private double height;
    public Demo013(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
    public static void main(String[] args) {
        Demo013 triangle = new Demo013(10, 5);
        double area = triangle.calculateArea();
        System.out.println(triangle);
        System.out.println("The area of the triangle is: " + area);
    }
}
