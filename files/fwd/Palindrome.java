import java.util.Scanner;
class Palindrome
{
     public static void main(String[]args)
       {
            int r,sum=0,temp,n;
            System.out.println("Enter the number");
            Scanner obj=new Scanner(System.in);
            n=obj.nextInt();
    
            temp=n;
           while(n>0)
              {
                     r=n%10;
                     sum=(sum*10)+r;
                     n=n/10;
               } 
            if(temp==sum)
                  {
                         System.out.println("The number is a palindrome");
                   }
             else
                   {
                          System.out.println("Not a palindrome");
                   }
                         System.out.println("\t-By Prabhat Mishra");
           }
}
