package pack99;


//Write a program to implement constructor overloading for a Rectangle class 
//(one constructor with no arguments, one with length & breadth).
public class Rectangle 
{
	int l,b,R;
	public Rectangle()
	{
		System.out.println(" no arguments constructor");
	}
	
	public Rectangle (int L, int B)
	{
		this.l=L;
		this.b=B;
	}
	
	public void display()
	{
		R=l*b;
		System.out.println("Area of Rectanle is :"+R);
	}

	public static void main(String[] args)
	{ 
		Rectangle   R1=new Rectangle  ();
		Rectangle  R2=new Rectangle  (2,3);
		
		R1.display();
		R2.display();

	}

}
