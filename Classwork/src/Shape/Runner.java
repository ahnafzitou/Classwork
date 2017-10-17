package Shape;

public class Runner 
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(3.14,1);
		Circle circle1 = new Circle(1);
		if(rectangle1.perimeter() > circle1.perimeter())
		{
			System.out.println("Rectangle has larger perimeter");
		}
		if(rectangle1.area() > circle1.area())
		{
			System.out.println("Rectangle has larger area");
		}
		if(circle1.perimeter() > rectangle1.perimeter())
		{
			System.out.println("Circle has larger perimeter");
		}
		if(circle1.area() > rectangle1.area())
		{
			System.out.println("Circle has larger area");
		}
		if(circle1.area() == rectangle1.area())
		{
			System.out.println("Same area");
		}
		if(circle1.perimeter() == rectangle1.perimeter())
		{
			System.out.println("Same perimeter");
		}
	}
} 
