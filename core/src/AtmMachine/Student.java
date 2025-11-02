package AtmMachine;

import java.util.Scanner;

public class Student 
{
	static Scanner sc=new Scanner(System.in);
	static int rank;
	public void method()
	{
		System.out.println("enter your rank");
		rank=sc.nextInt();
		if(rank<=1000)
		{
			System.out.println(" Student get enrollment in JNTUK ");
		}
		else if(rank<=3000)
		{
			System.out.println("Student get enrollment in RVR&JC College");
		}
		else if(rank<=5000)
		{
			System.out.println("Student get enrollment in VIGNAN College");
		}
		else if(rank<=7000)
		{
			System.out.println("Student get enrollment in Sidhardha College");
		}
		else if(rank<=12000)
		{
			System.out.println("Student get enrollment in NEC College");
		}
		else
			System.out.println("better luck next tym");
	}
    public static void main(String[] args) 
    {
		Student s=new Student();
		s.method();
	}
}
