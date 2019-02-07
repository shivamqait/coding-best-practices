import java.util.Scanner;
class Area

{

    void areaSquare(float s)

    {

        System.out.println("the area of the square is "+Math.pow(s, 2)+" sq units");

    }

    void areaRectangle(float l, float b)

    {

        System.out.println("the area of the rectangle is "+l*b+" sq units");

    }

    void areaCircle(float r)

    {
        float pi = (float) 3.14f;

        float totalCircle = pi * r * r;

        System.out.println("the area of the circle is "+totalCircle+" sq units");
    }

    void areaTriangle(float b, float h)

    {
         
        float totalTriangle = (1/2) * b * h;

        System.out.println("the area of the Triangle is "+totalTriangle+" sq units");

    }





     public static void main(String args[]) 

	{
         Area obj = new Area();       

         Scanner scan = new Scanner(System.in);
        
         System.out.println("Enter 1 for square 2 for rectangle 3 for circle 4 for triangle");

         String response = scan.next();
        
         if (response.equals("1") ) 

         {
         
         System.out.println("what is the side?");

         float side = scan.nextFloat();

         obj.areaSquare(side);
         
         }
         else if (response.equals("2") )

         {

         System.out.println("what is your length?");

         float length = scan.nextFloat();

         System.out.println("what is your breadth");

         float breadth = scan.nextFloat();

         obj.areaRectangle(length, breadth);
    
         }
         else if (response.equals("3"))

         {

         System.out.println("what is your radius?"); 

         float radius = scan.nextFloat();

         obj.areaCircle(radius);

         }
         else
          
         {

         if (response.equals("4")) 

         {

         System.out.println("what is your base?");

         float base = scan.nextFloat();

         System.out.println("what is your height");

         float height = scan.nextFloat();

         obj.areaTriangle(base, height);

         }

         }    
 
    }

}
