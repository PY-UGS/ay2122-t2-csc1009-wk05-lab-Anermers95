public class Triangle extends Shape {

    Triangle(double dim1, double dim2)
    {
        super(dim1,dim2);
    }

    @Override
    public double area() {
        System.out.println("Area of triangle is");
        return 0.5 * dim1 * dim2;
    }
    
}
