package javalab;
abstract class Shape
{
	abstract void numberOfsides();
}
class Rectangle extends Shape
{
	int side;
    Rectangle(int side)
    {
         this.side=side;
    }
    void numberOfsides()
    {
         System.out.println("I am Rectangle,Number of sides="+side);
    }
}
class Triangle extends Shape
{
    int side;
    Triangle(int side)
    {
         this.side=side;

	}
    void numberOfsides()
    {

		 System.out.println("I am Triangle,Number of sides="+side);
	}
}
class Hexagon extends Shape
{

	int side;
    Hexagon(int side)
    {

		this.side=side;
    }
    void numberOfsides()
    {

		System.out.println("I am Hexagon,Number of sides="+side);
    }
}
public class AbstractClass
{
   public static void main(String[] args)
   {

	   Rectangle r=new Rectangle(4);
       Triangle t=new Triangle(3);
       Hexagon h=new Hexagon(6);
       r.numberOfsides();
       t.numberOfsides();
       h.numberOfsides();
   }  
}
