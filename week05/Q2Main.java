public class Q2Main {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(9,5);
        Triangle t = new Triangle(10, 8);
        Circle1 c = new Circle1(5,5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);
        Shape figref;

        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());
    }
    
}
