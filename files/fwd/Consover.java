class Consover
{      
	int rollno;
	String name;
        Consover()
	{
		this(54,"Prabhat Mishra");
		System.out.println("THIS IS CONSTRUCTOR OVERLOADING");
	}
	Consover(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public void Show()
	{
		System.out.println("Roll Number :: "+rollno+"\nName::"+name);
	}
	public static void main(String args[])
	{
		Consover obj=new Consover();
		obj.Show();
		System.out.println("Prabhat Mishra");
		System.out.println("Roll No=54");
	}
		
}
 
	