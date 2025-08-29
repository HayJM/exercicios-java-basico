package exercicio05;

public record Circle(double radius)implements GeometricForm{
    private static final double PI = 3.14;
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

}
