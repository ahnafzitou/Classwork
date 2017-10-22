package Shape;

public class Circle implements Shape 
{
	private int radius;
    private static double pi = 3.14;

    public Circle(int radius){
       this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return ((radius*radius)*pi);
    }

    @Override
    public double calculatePerimeter()
    {
        return ((2*radius)*pi);
    }

    @Override
    public String toString()
    {
        return "Circle radius " + radius + " area " + this.calculateArea() + " perimeter " + this.calculatePerimeter();
    }

}
