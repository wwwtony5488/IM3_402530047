
import java.util.*;
class Rectangle {
  	double height,width,x,y;
  	Rectangle() {
  		this(0,0,0,0);
  	}
  	Rectangle(double _height, double _width, double _x, double _y) {
  		this.height=_height;
  		this.width=_width;
  		this.x=_x;
  		this.y=_y;
  	}

  	public double getheight()
  	{
  		return this.height;
  	}

  	public double getwidth() {
  		return this.width;
  	}

  	public double getx() {
  		return this.x;
  	}

  	public double gety() {
  		return this.y;
  	}

  	public String toString() {
  		return "java.Rectangle:" + "[ x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + "]";
  	}
}





public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);		
		double height,width,x,y;

		System.out.println("--------the first rectangle on--------");
        
		System.out.println("height=");
		height = console.nextDouble();
		System.out.println("width=");
		width = console.nextDouble();
		System.out.println("x=");
		x = console.nextDouble();
		System.out.println("y");
		y = console.nextDouble();
		Rectangle rectangle1 = new Rectangle(height, width, x, y);
		System.out.println(rectangle1.toString());
		System.out.println("Area:" + rectangle1.getwidth() * rectangle1.getheight());
		System.out.println("Perimeter:" + (rectangle1.getwidth() * 2 + rectangle1.getheight() * 2));

		
		System.out.println("-------- the first rectangle end--------");
		System.out.println("");
		System.out.println("");
		System.out.println("-------- the second rectangle on--------");
		
		System.out.println("height:");
		height = console.nextDouble();
		System.out.println("width:");
		width = console.nextDouble();
		System.out.println("x:");
		x = console.nextDouble();
		System.out.println("x:");
		y = console.nextDouble();
		Rectangle rec2 = new Rectangle(height, width, x, y);
		System.out.println(rec2.toString());
		System.out.println("Area:" + rec2.getwidth() * rec2.getheight());
		System.out.println("Perimeter:" + (rec2.getwidth() * 2 + rec2.getheight() * 2));

		System.out.println("-------- the second rectangle end --------");
		System.out.println("end of RectangleTester thanks");
		
		console.close();
	}

}
