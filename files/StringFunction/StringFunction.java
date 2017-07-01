import java.*;
class StringFunction
{
	public static void main(String args[])
	{
		String s1="	SHEMARK 1234567890";
		String s2="	shemark	1234567890";
		System.out.println("Replace s1() :: "+s1.replace('A','S'));
		System.out.println("Replace s2 :: "+s2.replace('a','s'));
		System.out.println("To Upper Case s2() :: "+s2.toUpperCase());
		System.out.println("To Lower Case s1() :: "+s1.toLowerCase());
		System.out.println("Sub String1 () :: "+s1.substring(3,10));
		System.out.println("Sub String2 () :: "+s2.substring(3,10));
		System.out.println("ReplaceCharSequence1 () :: "+s1.replace("SH","DE"));
		System.out.println("ReplaceCharSequence2 () :: "+s2.replace("sh","de"));
		System.out.println("CharAt for s1 () :: "+s1.charAt(4));
		System.out.println("CharAt for s2 () :: "+s2.charAt(5));
		System.out.println(s1 + " <<Equals>> " + s2 +    s1.equals(s2));
		System.out.println("Without Trim s1 () :: "+s1);
		System.out.println("With Trim s1 () :: "+s1.trim());
		System.out.println("Without Trim s2 () :: "+s2);
		System.out.println("With Trim s2 () :: "+s2.trim());
	}
}
