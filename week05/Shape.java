public abstract class Shape {

    protected double dim1,dim2;
    protected double pi = 3.14;

    Shape()
    {
        
    }

    Shape(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
    
}
