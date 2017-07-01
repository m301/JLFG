public class BubbleSort{
  public static void main(String[] args){
     int a[] = {1,2,4,2,3,5,5,6,8};
     
     
     for(int i=0;i<a.length;++i){
      for(int j=1;j<a.length;++j){
        if(a[j]<a[j-1]){
			int tmp = a[j-1];
			a[j-1]= a[j];
			a[j] = tmp;
		}
	   }
     }
     
     
     System.out.println("Sorted array is : ");
     for(int i=0;i<a.length;++i)
		System.out.print(a[i]+" ");
     
  }
 
}
