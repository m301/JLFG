import java.util.Scanner;
class Armstrong
{
      public static void main(String[]args)
          {
                 int c=0,a,temp,n;
                 System.out.println("Enter the number");
                 Scanner obj=new Scanner(System.in);
                 n=obj.nextInt();
    	
                 temp=n;
                while(n>0)
                     {
                            a=n%10;
                            n=n/10;
                            c=c+(a*a*a);
                     }  
                 if(temp==c)
                    {
                            System.out.println("The number is an Armstrong number");
                   }
                else
                   {
                            System.out.println("Not an Armstrong number");
                   }
        }
}
