class Over
{
	int rollno;
	String name;
	void M1()
	{
		System.out.println("No arguments.");
		this.M1(10,"Student");
	}
	void M1(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void M1(String name)
	{
		System.out.println("Name is::"+name);
	}
	void show()
	{
		System.out.println("Roll no::"+rollno);
		System.out.println("Name is::"+name);
	}
}
class Overloading
{
	public static void main(String args[])
	{
		Over obj=new Over();
		obj.M1();
		obj.show();
	}
}
