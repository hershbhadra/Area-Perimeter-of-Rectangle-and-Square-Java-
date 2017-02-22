//Hersh Bhadra: This program will use the user input attributes to calculate the perimeter and area of rectangle  

public class Rectangle 
{
	public int width = 1;
	public int height = 1;
	//instance variables that store values will be available globally  
	
	public Rectangle(int w, int h) // Set width and length
	{
		width = w;	
		height = h;
		}//end Rectangle
	public int getArea() //calculate area
	{
		return width * height;
		}//end getArea
	public int getPerimeter() //calculate perimeter
	{
		return (2*height) + (2*width);
		}//end getPerimeter
	}//end class Rectangle
