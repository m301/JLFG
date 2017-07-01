//Program for Prameterized Constructor

class Pcons
{      
	static int a,b;
	Pcons(int c,int d)
	{
		a=c;
		b=d;
		System.out.println("THIS IS PARAMETERIZED");
	}

		public static void main(String args[])
		{
			Pcons obj=new Pcons(10,20);
			int add=a+b;
			System.out.println("ADDITION IS::"+add);
			System.out.println("Prabhat Mishra");
			System.out.println("Roll No=54");
		}
}
 
	