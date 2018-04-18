package testing;

import static org.junit.Assert.*;
import myapp.MyController;

import org.junit.Test;

public class MyControllerTest {
	@Test
	public void returnValidJSON() {
		assertEquals("{\"id\":123}", new MyController().test("Timo"));
	}
}
