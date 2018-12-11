import static org.junit.Assert.*;

import org.junit.Test;


public class test1 {

	@org.junit.Test
	public void test() {
		Tour a = new Tour(14, 2, 1.28,1.2, 4000, 20000, 100);
		assertEquals("166560.0",a.getResult());
	}

}
