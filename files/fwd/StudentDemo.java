class Student
{
this.name=n;
this.marks=m;
this.rollno=r;
void getDetail()
{
System.out.println("name is="+name+"\nmarks is="+marks+"\nrollno is="+rollno);
}
}
class StudentDemo
{
public static void main(String[]args)
{
Student s=new Student("Mayank",85,7);
s.getDetail();
System.out.println("\t-By Prabhat Mishra");
}
}
