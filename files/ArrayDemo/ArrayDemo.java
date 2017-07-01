import java.util.*;

public class ArrayDemo{
	public static void main(String []args){
		int [] arr=new int[5];
		System.out.println("Enter the value of array: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("You have entered these values: ");
		for(int i=0;i<5;i++){
			System.out.println(" "+arr[i]);
		}
	}
}
