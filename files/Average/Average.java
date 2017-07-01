public class Average{
  public static void main(String[] args){
     int a[] = {1,2,4,12,456};
     int sum=0;
     for(int i=0;i<a.length;++i)
        sum+=a[i];
     int avg = sum/a.length;
     System.out.println("Average of "+a.length+" elements is "+avg);
  }
 
}
