//Hersh Bhadra: This program will inherit attributes from superclass Rectangle and calculate area and perimeter of square. 

public class Square extends Rectangle// Subclass Square inherits from superclass Rectangle
{
	public Square(int w,int h)// Constructor with the argument
	{
		super(w,h); //explicit call to superclass Rectangle 
	   	} //end Square
	public int getArea()//calculate area 
	{
		return width * height;
		}//end getArea
	public int getPerimeter() //calculate perimeter
	{
		return (2*height) + (2*width);
		}//end getPerimeter
	}//end class Square
