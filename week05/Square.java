public class Square extends Shape {

    Square(double dim1, double dim2)
    {
        super(dim1,dim2);
    }

    @Override
    public double area() {
       System.out.println("Area of square is");
       return dim1 * dim2;
    }
    
}
