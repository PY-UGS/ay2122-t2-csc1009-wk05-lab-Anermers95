public class Ellipse extends Shape {


    Ellipse(double dim1,double dim2)
    {
        super(dim1,dim2);
    }

    @Override
    public double area() {
        System.out.println("Area of ellipse is");
        return super.pi * dim1 * dim2;
    }
    
}
