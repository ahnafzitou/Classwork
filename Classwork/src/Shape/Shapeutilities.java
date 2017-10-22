package Shape;
import java.util.Random;

public class Shapeutilities 
{
	public static Shape getRandomShape()
	{
		Random rand = new Random();
		int x = rand.nextInt(3);
		switch (x) 
        {
            case 0:
                return new Circle(rand.nextInt(100));
            case 1:
                return new Rectangle(rand.nextInt(50), rand.nextInt(50));
            case 2:
                return new Square(rand.nextInt(50));
            default:
            	return new Circle(rand.nextInt(100));
        }
		
       }

	public static double sumPerimeter(Shape[] shapeArr)
	{
		double x = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			x = shapeArr[i].calculatePerimeter() + x;
		}
		return x;
	}
	public static double sumArea(Shape[] shapeArr)
	{
		double x = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			x = shapeArr[i].calculateArea() + x;
		}
		return x;
	}

}
