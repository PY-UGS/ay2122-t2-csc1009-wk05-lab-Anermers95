public class CircleFromObject extends GeometricObject {

    private double radius;
    CircleFromObject()
    {

    }
    
    CircleFromObject(double radius)
    {
        this.radius = radius;
    }

    
    CircleFromObject(double radius, String color, boolean filled)
    {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getDiameter() {
       return 2 * this.radius;
    }
    
}
