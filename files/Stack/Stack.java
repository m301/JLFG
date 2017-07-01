import java.util.*;
class Stack
{
	int top;
	int size=10;
	int a[]=new int[100];
	void Push()
	{
		if(top==size-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			int element;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the elements to be inserted");
			element=sc.nextInt();
			top=top+1;
			a[top]=element;
		}
	}
	int Pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			top=top-1;
		}
		return top;
	}
	void Display()
	{
		for(int i=1;i<=top;i++)
		{
			System.out.println("Array elements="+a[i]);
		}
	}
	public static void main(String args[])
	{
		int choice;
		int ch,n;
		Stack stack=new Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Stack ");
		n=sc.nextInt();
		do
		{
			System.out.println("Enter your choice");
			System.out.println(" 1:Push\n 2:Pop\n 3:Display");
			choice=sc.nextInt();
			switch(choice)	
			{
				case 1:
					stack.Push();
					break;
				case 2:
					stack.Pop();
					break;
				case 3:
					stack.Display();
					break;
				default:
					System.out.println("Invalid Input");
			}
			System.out.println("Do you want to continue");
			ch=sc.nextInt();
		}
		while(ch==1);

	}
}

		
						
