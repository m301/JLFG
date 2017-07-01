import java.util.*;
class Greatest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter the number");
		num1=sc.nextInt();
	 	num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("Greater number is :: "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Greater number is :: "+num2);
		}
		else
		{
			System.out.println("Greater number is :: "+num3);
		}
	}
}
			
