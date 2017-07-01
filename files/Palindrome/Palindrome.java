import java.util.Scanner;
public class Palindrome{
  public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter a number : ");
     int num = s.nextInt();
     
     int temp  = num,rev=0;
     while(temp>0){
		rev=rev*10+temp%10;
		temp /=10;
	 }
       
     if(num==rev)
	 	System.out.println("it's a palindrome.");
	 else
	 	System.out.println("it's not a palindrome.");
  }
 
}
