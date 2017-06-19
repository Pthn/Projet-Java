package model.element;

import static org.junit.Assert.assertEquals;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpriteTest {
	 
	private Sprite sprite;
	 @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	    }

	    @AfterClass
	    public static void tearDownAfterClass() throws Exception {
	    }

	    @Before
	    public void setUp() throws Exception {
	       Sprite sprite = new Sprite("", "MyHero.png");
	    }

	    @After
	    public void tearDown() throws Exception {
	    }
	@Test
	public void testLoadImage() {
		final String expected = "MyHero.png";
        assertEquals(expected,("images/" + sprite.getImageName()));
	}

}
