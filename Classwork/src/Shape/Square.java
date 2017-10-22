package Shape;

public class Square extends Rectangle
{
	int side;
	public Square(int side)
    {
        super(side,side);
        this.side = side;
    }

    @Override
    public String toString()
    {
    	return "Square side " + side + " area " + this.calculateArea() + " perimeter " + this.calculatePerimeter(); 
    }

}
