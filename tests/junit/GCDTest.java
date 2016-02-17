package junit;

import junit.framework.TestCase;
import pass.GCD;

public class GCDTest extends TestCase {
	private GCD gcd ;
	
	protected void setUp() throws Exception {
		super.setUp();
		gcd = new GCD();
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
	}
	
	public void testGCD(){
		this.assertEquals( gcd.gcd(8, 18), 2);
	}
}