
public class Geomentric1 
{

   public void calculateArea(float x)
   {
	   System.out.println("Area of square is: "+x*x+"sq.units");
   }
   public void calculateArea(float x, float y)
   {
	   System.out.println("Area of rectangle is:"+x*y+"sq.units");
   }
   public void calculateArea(double r)
   {
	   double area=3.14*r*r;
	   System.out.println("Area of circle is:"+area+"sq.units");
   }

   public  static void  main(String[] args)
   {
	    Geomentric1 x=new Geomentric1();
	    x.calculateArea(16);
	   	x.calculateArea(25, 25);
	   	x.calculateArea(4.0);
	    
   }
      
   
   
   }

