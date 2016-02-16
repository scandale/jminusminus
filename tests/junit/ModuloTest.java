package junit;

import junit.framework.TestCase;
import pass.Modulo;

public class ModuloTest extends TestCase {
	private Modulo modulo ;
	
	protected void setUp() throws Exception {
		super.setUp();
		modulo = new Modulo();
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
	}
	
	public void testDivide(){
		this.assertEquals( modulo.modulo(0, 42), 0);
		this.assertEquals( modulo.modulo(42, 1), 0);
		this.assertEquals( modulo.modulo(127, 3), 1);
		this.assertEquals( modulo.modulo(128, 3), 2);
	}
}