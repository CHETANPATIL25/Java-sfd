package project;

public class typecasting 
{
	public static void main(String args[])
	{
		//implicit conversion
	    // int type variable
		int i = 10;
		System.out.println("The integer value:"+i);
		
		//double type variable
		double j = i;
		System.out.println("The double vaue:"+j);
		
		//long type variable
		long k = i;
		System.out.println("The long value:"+k);
		
		//float type variable
		float l = i;
		System.out.println("The float value:"+l);
		System.out.println("   ");
		
		
		// explicit conversion
		double  a = 10.55;
		int b = (int)a;
		System.out.println("The int value:"+b);
		
		short c = (short)a;
		System.out.println("The short value:"+c);
	}
	
}
