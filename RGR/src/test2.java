import static org.junit.Assert.*;

import org.junit.Test;


public class test2 {
	@org.junit.Test
	public void test2() {
		Tour a = new Tour(14, 1, 1.34,1.6, 6000, 40000, 200);
		assertEquals(a.getResult(),"142080.0");
	}
}
