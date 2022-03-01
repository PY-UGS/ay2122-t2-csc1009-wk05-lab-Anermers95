public class TestCircleRectangle{

    public static void main(String[] args) {
        CircleFromObject circle = new CircleFromObject(1);
        RectangleFromObject rec = new RectangleFromObject(2,4);

        //Circle
        System.out.println("A circle" + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        //Rectangle
        System.out.println("A rectangle " + rec.toString());
        System.out.println("The color is " + rec.getColor());
        System.out.println("The area is " + rec.getArea());
        System.out.println("The perimeter is " + rec.getPerimeter());
    }
}