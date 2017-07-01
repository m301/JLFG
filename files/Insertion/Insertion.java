import java.util.*;
class Insertion
{
	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int n,i,k,j,temp,smallest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements::");
		n=sc.nextInt();
		System.out.println("Enter the elements::");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=1;i<n;i++)
		{
			temp=a[i];
			j=i-1;	
			while((temp<a[j]) && (j>0))
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
			System.out.print("After passes "+i+" :: ");
			for(k=0;k<n;k++)
			{
				System.out.print(a[k]+"\t");
			}
			System.out.println();		
		}
		System.out.print("Sorted Array :: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}	

}


