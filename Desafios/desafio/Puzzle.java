package desafio;

import java.math.BigInteger;

public class Puzzle {
	final static BigInteger M = new BigInteger("2017");

	private static BigInteger compute(long n){
		String s="";
		for (long i=0;i<n;i++){
			s = s + n;
	}
		return new BigInteger(s.toString()).mod(M);
	}
	
	public static void maint(String args[]){
		for(long n:new long[]{1L,2L,5L,20L,58184241583791680L})
{
	System.out.println(""+n+":"+compute(n));
}
	}
}
