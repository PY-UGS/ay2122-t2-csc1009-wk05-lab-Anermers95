public class RectangleFromObject extends GeometricObject {

    private double width;
    private double height;

    RectangleFromObject()
    {

    }
    
    RectangleFromObject(double width, double height)
    {
        super();
        this.width = width;
        this.height = height;
    }

    RectangleFromObject(double width, double height,String color,boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return this.width;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return this.height;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getPerimeter()
    {
        return height + height + width + width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
    
}
