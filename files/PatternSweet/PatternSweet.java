public class PatternSweet{
  public static void main(String[] args){
     int c = 6;
     for(int i=0;i<c;++i){
      for(int j=0;j<(c-i);++j)
	System.out.print(" ");
      for(int j=0;j<=i;++j)
        System.out.print("* ");
      System.out.println("");
     }
     
     for(int i=0;i<c;++i){
      for(int j=0;j<=i;++j)
	System.out.print(" ");

      for(int j=0;j<(c-i);++j)
        System.out.print("* ");
      System.out.println("");
     }
  }
 
}
