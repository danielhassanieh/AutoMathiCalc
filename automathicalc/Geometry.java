package automathicalc;

public class Geometry
{

    /**Returns the area of a square given its side.
     * @param side : A side of the square.
     * @return the area of the square.
     */
    public static double squareArea(double side)
    {
        return side * side;
    }

    /**Returns the perimeter of a square given its side.
     * @param side : A side of the square.
     * @return the perimeter of the square.
     */
    public static double squarePerimeter(double side)
    {
        return side * 4;
    }

    /**Returns the area of a rectangle given its length and width.
     * @param l : The length of the rectangle.
     * @param w : The width of the rectangle.
     * @return the area of the rectangle.
     */
    public static double rectangleArea(double l, double w)
    {
        return l * w;
    }

    /**Returns the perimeter of a rectangle given its length and width.
     * @param l : The length of the rectangle.
     * @param w : The width of the rectangle.
     * @return the perimeter of the rectangle.
     */
    public static double rectanglePerimeter(double l, double w)
    {
        return (l * 2) + (w * 2);
    }
  
}