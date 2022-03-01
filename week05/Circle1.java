public class Circle1 extends Shape {

    Circle1(double dim1, double dim2)
    {
        super(dim1,dim2);
    }
    @Override
    public double area() {
        System.out.println("Area of circle is");
        return super.pi * this.dim1 * this.dim1;
    }
    
}
