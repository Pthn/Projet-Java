package model.element.mobile;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IMap;

public class BlockDiamondFallTest{


	private BlockDiamondFall blockdiamondfall;
	
	 @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	    }

	    @AfterClass
	    public static void tearDownAfterClass() throws Exception {
	    }

	    @Before
	    public void setUp() throws Exception {
	        this.blockdiamondfall = new BlockDiamondFall(x, y, map);
	    }

	    @After
	    public void tearDown() throws Exception {
	    }

	@Test
	public void testBlockDiamondFall() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeToStatic() {
		fail("Not yet implemented");
	}
 
}
