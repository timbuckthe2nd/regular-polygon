import java.lang.Math;

public class RegularPolygon
{
    private int numberOfSides;
    private double sideLength;
    private double area;
    private double perimeter;

    // constructs a default polygon with 3 sides of length 1
    public RegularPolygon()
    {
        this.numberOfSides = 3;
        this.sideLength = 1;
        setArea();
        setPerimeter();
    }

    // constructs a default polygon if user input is invalid
    public RegularPolygon(int sides, double length)
    {
        if (sides < 3 || sideLength < 0)
        {
            this.numberOfSides = 3;
            this.sideLength = 1;
        }  
        else
        {
            this.numberOfSides = sides;
            this.sideLength = length;
        } 
        setArea();
        setPerimeter();
    }

    // copies the referenced values of an existing polygon to a new one
    public RegularPolygon(RegularPolygon originalPolygon)
    {
        this.numberOfSides = originalPolygon.getNumberOfSides();
        this.sideLength = originalPolygon.getSideLength();
        setArea();
        setPerimeter();
    }

    // changes the value of numberOfSides
    public void setNumberOfSides(int number)
    {
        if (number < 3) return;
        numberOfSides = number;
        setArea();
        setPerimeter();
    }

    // changes the value of sideLength
    public void setSideLength(double length)
    {
        if (length < 0) return;
        sideLength = length;
        setArea();
        setPerimeter();
    }

    public int getNumberOfSides()
    {
        return numberOfSides;
    }

    public double getSideLength()
    {
        return sideLength;
    }

    public double getArea()
    {
        return area;
    }

    public double getPerimeter()
    {
        return perimeter;
    }

    // determines whether or not two different objects are identical
    public boolean equals(RegularPolygon other)
    {
        if (this == other) 
        	return true;

        if ((this.numberOfSides == other.getNumberOfSides())
         && (this.sideLength == other.getSideLength())
         && (this.perimeter == other.getPerimeter())
         && (this.area == other.getArea()))
        	return true;
        else
        	return false;
    }

    // sets the area of the polygon
    private void setArea()
    {
        this.area = (numberOfSides * sideLength * sideLength) /
            (4 * Math.tan(Math.PI / numberOfSides));
    }

    // sets the perimeter of the polygon
    private void setPerimeter()
    {
        this.perimeter = this.numberOfSides * this.sideLength;
    }
}
