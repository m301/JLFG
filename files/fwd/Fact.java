//Foctorial

import java.util.*;
class Fact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int fact=1,i,n;
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	System.out.println("Factorial is :: "+fact);
	System.out.println("-By Prabhat Mishra");
	}
}
			