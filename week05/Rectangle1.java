public class Rectangle1 extends Shape {

    Rectangle1(double dim1, double dim2)
    {
        super(dim1,dim2);
    }

    @Override
    public double area() {   
        System.out.println("Area of rectangle is");
        return dim1 * dim2;
    }
    
}
