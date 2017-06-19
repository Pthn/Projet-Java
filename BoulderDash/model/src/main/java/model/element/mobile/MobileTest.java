package model.element.mobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map; 
public class MobileTest {
	private Map map;

	 @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	    }

	    @AfterClass
	    public static void tearDownAfterClass() throws Exception {
	    }

	    @Before
	    public void setUp() throws Exception {
	       Map map = new Map("MyHero.png");
	    }

	    @After
	    public void tearDown() throws Exception {
	    }

	@Test
	public void testMoveUp() {
		final String expected = "MyHero.png";
        assertEquals(expected, map.getOnTheMapXY(-3,-2));
	}



	@Test
	public void testMoveLeft() {
		final String expected = "MyHero.png";
        assertEquals(expected, map.getOnTheMapXY(-2,-3));
	}

	@Test
	public void testMoveDown() {
		final String expected = "MyHero.png";
        assertEquals(expected, map.getOnTheMapXY(-3,-4));
	}

	@Test
	public void testMoveRight() {
		final String expected = "MyHero.png";
        assertEquals(expected, map.getOnTheMapXY(-4,-3));
	}


}
 