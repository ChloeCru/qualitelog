import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAddition() {
		//Cas de base
		assertEquals(7, App.addition(2,5), "2+5=7");
		//Cas négatif
		assertEquals(-3, App.addition(2,-5), "2+-5=-3");
		//Cas grands nombres
		assertEquals(3000000, App.addition(2000000,1000000), "1000000+2000000=3000000");
	}

}
