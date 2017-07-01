import java.util.*;
class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("1:- Area of circle  \n2:- Area of Rectangle  \n3:- Area of Triangle  ");
		System.out.println("Enter your choice ");
		System.out.println("Calculate area ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				int r;
				double area1;
				System.out.println("Enter radius for Circle :: ");
				r=sc.nextInt();
				area1=3.14*r*r;
				System.out.println("Area of Circle is :: "+area1);
				break;
			case 2:
				int l,b;
				double area2;
				System.out.println("Enter Length :: ");
				l=sc.nextInt();
				System.out.println("Enter Breadth :: ");
				b=sc.nextInt();
				area2=l*b;
				System.out.println("Area of rectangle is :: "+area2);
				break;
			case 3:
				int base,h;
				double area3;
				System.out.println("Enter Base :: ");
				base=sc.nextInt();
				System.out.println("Enter Height :: "); 
				h=sc.nextInt();
				area3=0.5*base*h;
				System.out.println("Area of Triangle is :: "+area3);
				break;
			default:
				System.out.println("Invalid input");
		}
		
	}
}


