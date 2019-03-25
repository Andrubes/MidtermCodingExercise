package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testConstruction() {
		try {
			Rectangle r = new Rectangle(10,15);
		}
		catch(Exception e) {
			fail("Test failed to construct a Rectangle");
		}
	}
	
	@Test
	void testGetiWidth() {
		Rectangle r = new Rectangle(10,15);
		assertTrue(r.getiWidth() == 10);
	}

	@Test
	void testGetiLength() {
		Rectangle r = new Rectangle(10,15);
		assertTrue(r.getiLength() == 15);
	}

	@Test
	void testSetiWidth() {
		Rectangle r = new Rectangle(10,15);
		r.setiWidth(5);
		assertTrue(r.getiWidth() == 5);
	}
	
	@Test
	void testSetiLength() {
		Rectangle r = new Rectangle(10,15);
		r.setiLength(20);
		assertTrue(r.getiLength() == 20);
	}
	
	@Test
	void testArea() {
		Rectangle r = new Rectangle(10,15);
		assertTrue(r.area() == 150);
		
		boolean thrown = false;
		Rectangle s = new Rectangle(-10,15);
		  try {
		    s.area();
		  } catch (IllegalArgumentException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
		  
		  thrown = false;

		Rectangle d = new Rectangle(10,-15);
			try {
			   d.area();
			} catch (IllegalArgumentException e) {
			   thrown = true;
			}

			  assertTrue(thrown);
	}
	
	@Test
	void testPerimeter() {
		Rectangle r = new Rectangle(10,15);
		assertTrue(r.perimeter() == 50);
		
		boolean thrown = false;
		Rectangle s = new Rectangle(-10,15);
		  try {
		    s.perimeter();
		  } catch (IllegalArgumentException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
		  
		  thrown = false;

		Rectangle d = new Rectangle(10,-15);
			try {
			   d.perimeter();
			} catch (IllegalArgumentException e) {
			   thrown = true;
			}

			  assertTrue(thrown);
	}
	
	@Test
	void testCompareTo() {
		Rectangle r = new Rectangle(10,15);
		Rectangle s = new Rectangle(3,7);
		
		assertTrue(s.compareTo(r) == -1);
		assertTrue(r.compareTo(s) == 1);
		assertTrue(s.compareTo(s) == 0);
	}
	
	@Test
	void testIAE() {
		boolean thrown = false;
		Rectangle r = new Rectangle(10,-15);
		  try {
		    r.area();
		  } catch (IllegalArgumentException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
	}
	

}
