package com.programming;
import java.util.Random;
public class GenarateRandomNum {

	public static void main(String[] args) {
	
//way-1 RANDOM CLASS:
		
		Random r=new Random();
		int random=r.nextInt(100);
		double d=r.nextDouble(100.0);
		float f=r.nextFloat(50);
		boolean bl=r.nextBoolean();
		
		System.out.println(random);
		System.out.println(d);
		System.out.println(f);
		System.out.println(bl);
		
//Way-2 Math Class :
//By using this class by default we can genarate Decimal values After that we can Extract Integer Values:
		double rand=Math.random();
		System.out.println(rand);
		
//Way-3 Appache commons-lang Api
//	https://commons.appache.org		
//By using this Approach we can genarate Numbers As well as Strings
		
		
		
		
		
		
	}
	
}
