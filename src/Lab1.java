import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double l;
		double w;
		
		int userCont = 1;
		
		while(userCont != 0) {
		// Ask the user to input the length of the room
		System.out.print("Please enter the Length and Width of the room" + '\n' + "Enter the Length: ");
		l = input.nextDouble();
		
		// Ask the user to input the width of the room
		System.out.print("Enter the width: ");
		w = input.nextDouble();
		
		Rectangle rectangle = new Rectangle(l,w);
		
	    double rectangleArea = rectangle.getArea();
	    System.out.println("The area of a unit rectangle is " + rectangleArea);

	    double rectanglePermiter = rectangle.getPerimeter();
	    System.out.println("The permimiter of the unit rectangle is " + rectanglePermiter);
	    
	    
	    System.out.print("Would you like to continue 1: yes or 2: no?");
	    System.out.println("Enter the corresponding number: ");
	    userCont = input.nextInt();
		
		}
		
	}
}
	
	class Rectangle {
		
	    double length;
	    double width;

	    Rectangle(double length,double width)
	    {
	        this.length = length;
	        this.width = width;
	    }

	    double getArea()
	    {
	        return length * width;
	    }

	    double getPerimeter()
	    {
	        return 2 * (length + width);
	    }
	}
		
