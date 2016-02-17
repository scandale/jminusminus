package junit;

import junit.framework.TestCase;
import pass.MinusAssign;

public class MinusAssignTest extends TestCase {
	private MinusAssign minus_assign ;
	
	protected void setUp() throws Exception {
		super.setUp();
		minus_assign = new MinusAssign();
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
	}
	
	public void testMinusAssign(){
		this.assertEquals( minus_assign.minus_assign(10, 7), 3);
	}
}