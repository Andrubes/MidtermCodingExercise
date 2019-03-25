package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboidTest {

	@Test
	void testConstruction() {
		try {
			Cuboid c = new Cuboid(10,15,20);
		}
		catch(Exception e) {
			fail("Test failed to construct a Cuboid");
		}
	}
	
	@Test
	void testGetiWidth() {
		Cuboid c = new Cuboid(10,15,20);
		assertTrue(c.getiWidth() == 10);
	}

	@Test
	void testGetiLength() {
		Cuboid c = new Cuboid(10,15,20);
		assertTrue(c.getiLength() == 15);
	}

	@Test
	void testSetiWidth() {
		Cuboid c = new Cuboid(10,15,20);
		c.setiWidth(5);
		assertTrue(c.getiWidth() == 5);
	}
	
	@Test
	void testSetiLength() {
		Cuboid c = new Cuboid(10,15,20);
		c.setiLength(20);
		assertTrue(c.getiLength() == 20);
	}
	
	@Test
	void testGetiDepth() {
		Cuboid c = new Cuboid(10,15,20);
		assertTrue(c.getiDepth() == 20);
	}

	@Test
	void testSetiDepth() {
		Cuboid c = new Cuboid(10,15,20);
		c.setiDepth(30);
		assertTrue(c.getiDepth() == 30);
	}
	
	@Test
	void testArea() {
		Cuboid c = new Cuboid(10,15,20);
		assertTrue(c.area() == 1300);
		
		boolean thrown = false;
		Cuboid s = new Cuboid(-10,15,20);
		  try {
		    s.area();
		  } catch (IllegalArgumentException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
		  
		thrown = false;
		Cuboid d = new Cuboid(10,-15,20);
			try {
			   d.area();
			} catch (IllegalArgumentException e) {
			   thrown = true;
			}

			assertTrue(thrown);
			  
		thrown = false;
		Cuboid g = new Cuboid(10,15,-20);
			try {
				g.area();
			} catch (IllegalArgumentException e) {
				thrown = true;
			}

			assertTrue(thrown);
	}
	
	@Test
	void testVolume() {
		Cuboid c = new Cuboid(10,15,20);
		assertTrue(c.volume() == 3000);
		
		boolean thrown = false;
		Cuboid s = new Cuboid(-10,15,20);
		  try {
		    s.volume();
		  } catch (IllegalArgumentException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
		  
		thrown = false;
		Cuboid d = new Cuboid(10,-15,20);
			try {
			   d.volume();
			} catch (IllegalArgumentException e) {
			   thrown = true;
			}

			assertTrue(thrown);
			  
		thrown = false;
		Cuboid g = new Cuboid(10,15,-20);
			try {
				g.volume();
			} catch (IllegalArgumentException e) {
				thrown = true;
			}

			assertTrue(thrown);
	}
	
	@Test
	void testPerimeter() {
		boolean thrown = false;
		Cuboid c = new Cuboid(10,15,20);
		  try {
		    c.perimeter();
		  } catch (UnsupportedOperationException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
	}
	
	@Test
	void testIAE() {
		boolean thrown = false;
		Cuboid c = new Cuboid(10,-15,20);
		  try {
		    c.area();
		  } catch (IllegalArgumentException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
	}
	
	@Test
	void testSortByArea() {
		Cuboid c = new Cuboid(10,15,20);
		Cuboid d = new Cuboid(4,6,9);
		Cuboid e = new Cuboid(4,6,9);
		
		Cuboid.SortByArea s = c.new SortByArea();
		
		assertTrue(s.compare(c, d) == 1);
		assertTrue(s.compare(d, c) == -1);
		assertTrue(s.compare(e, d) == 0);
	}
	
	@Test
	void testSortByVolume() {
		Cuboid c = new Cuboid(10,15,20);
		Cuboid d = new Cuboid(4,6,9);
		Cuboid e = new Cuboid(4,6,9);
		
		Cuboid.SortByVolume s = c.new SortByVolume();
		
		assertTrue(s.compare(c, d) == 1);
		assertTrue(s.compare(d, c) == -1);
		assertTrue(s.compare(e, d) == 0);
	}
	

}
