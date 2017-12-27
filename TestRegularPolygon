import java.util.Scanner;

public class TestRegularPolygon
{
    static Scanner keyboard = new Scanner(System.in);
	
    // tests all the methods of the RegularPolygon class
    public static void main(String[] args)
    {
        RegularPolygon def = new RegularPolygon();
        showPolygon("Here is the information about the default polygon:", def);

        RegularPolygon original = getPolygon();
        RegularPolygon copy1 = new RegularPolygon(original);
        RegularPolygon copy2 = new RegularPolygon(original);

        System.out.print("\nHow many sides should the first modified polygon have? ");
        changeNumberOfSides(copy1);
        System.out.print("How long should the sides on the second modified polygon be? ");
        changeLengthOfSides(copy2);

        showPolygon("\nHere are the particulars about the original polygon:", original);
        showPolygon("\nHere is the information about the polygon with a different number of sides:", copy1);
        showPolygon("\nHere is the information about the polygon with a different length for the sides:", copy2);
    }

    // gets values for numberOfSides and side Length and returns a reference to constructed polygon
    public static RegularPolygon getPolygon()
    {
        System.out.print("\nHow many sides should the original polygon have? ");
        int sides = keyboard.nextInt();
        System.out.print("What should be the length of each side? ");
        double length = keyboard.nextDouble();
        return new RegularPolygon(sides, length);
    }
    
    // displays the parameters of the constructed polygon
    public static void showPolygon(String explanation, RegularPolygon polygon)
    {
        System.out.println(explanation);
        System.out.printf("  The given polygon has %d sides of length %.4f\n",
        				 polygon.getNumberOfSides(), polygon.getSideLength());
        System.out.printf("  The polygon's area is %.4f\n", polygon.getArea());
        System.out.printf("  The polygon's perimeter is %.4f\n", polygon.getPerimeter());
    }

    // changes the number of sides from user input
    public static void changeNumberOfSides(RegularPolygon polygon)
    {
        int sides = keyboard.nextInt();
        polygon.setNumberOfSides(sides);
    }

    // changes the side length from user input
    public static void changeLengthOfSides(RegularPolygon polygon)
    {
        double sides = keyboard.nextDouble();
        polygon.setSideLength(sides);
    }
}
