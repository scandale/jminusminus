package fail;

import java.lang.System;

public class Division{
	public static void main(String [] args ){
		int x = 10;
		x -= "a";
		System.out.println( x );
	}
}