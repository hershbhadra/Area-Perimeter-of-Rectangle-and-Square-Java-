//Hersh Bhadra: This program will demonstrate the code written in Rectangle class and Square class. 

import java.util.Scanner;// program uses Scanner

public class TestDriver 
{
	public static void main (String [] args)// main method begins program execution
	{ 
		int input1;
		int input2;
		int input3;
		int input4;
		//instance variables that store values from user input
  
		Scanner input = new Scanner(System.in);  // read user input
		do // 'do while' loop will execute application till the EXIT option is not selected
		{ 
			System.out.print("\nTo select RECTANGLE, press '1' ");	
			System.out.print("\nTo select SQUARE, press '2' "); 
			System.out.print("\nTo EXIT application, press '0' ");
			input1 = input.nextInt();//read input for input1 
  
			if (input1 == 1)//input 1 is for rectangle
			{
				System.out.println("\nRectangle selected\n"); //prints out the rectangle choice
				System.out.print("Enter Width: ");//prompt user input
				input2 = input.nextInt();//read user input
				System.out.print("Enter Length: ");//prompts user input
				input3 = input.nextInt(); //read user input
				Rectangle rectangle1 = new Rectangle(input2, input3);//Create object rectangle1 and pass input values
				int Area   = rectangle1.getArea();	//method to retrieve area
				int Perimeter = rectangle1.getPerimeter();//method to retrieve perimeter 
				System.out.printf("\nWidth: %d, Length: %d\n", input2, input3); //prints out the original input values
				System.out.println("Area (W*L) =   " +Area); //print calculated area
				System.out.println("Perimeter (2W + 2L) =   "  +Perimeter);//print calculated perimeter
				}
 
				else if (input1 == 2)//input 2 is for Square
				{
					System.out.println("\nSquare selected\n"); //prints out the Square choice
					System.out.print("Enter side: "); //prompts user for only one side of the square
					input4 = input.nextInt(); //read in input value
					Rectangle rectangle1 = new Rectangle(input4, input4);//Create object rectangle1 and pass input values
					int Area   = rectangle1.getArea();//get method for area
					int Perimeter = rectangle1.getPerimeter();//get method for perimeter	
					System.out.printf("\nSide: %d\n", input4);//print user input
		 			System.out.println("Area (Side * Side) =   " +Area);
					System.out.println("Perimeter (Side * 4) =   "  +Perimeter);
					}//end else if
			}//end do
		while (input1 != 0); //end loop if zero is input
		System.out.println("\nThank you for using this application");
		
		}//end main
	}// end of class TestDriver