import java.util.*;
class Cal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice,num1,num2;
		System.out.println("Enter your choice : ");
		System.out.println("1:- Addition\n2:- Substraction\n3:- Multiplication\n4:- Division:- ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				int add;
				System.out.println("Enter your number :: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				add=num1+num2;
				System.out.println("Addition is :: "+add);
				break;
			case 2:
				int sub;
				System.out.println("Enter your number :: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				sub=num1-num2;
				System.out.println("Subtraction is :: "+sub);
				break;
			case 3:
				int mul;
				System.out.println("Enter your number :: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				mul=num1*num2;
				System.out.println("Multiplication is :: "+mul);
				break;
			case 4:
				int div;
				System.out.println("Enter your number :: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				div=num1/num2;
				System.out.println("Division is :: "+div);
				break;
			default:
				System.out.println("Invalid input");
		}			
	}
}


