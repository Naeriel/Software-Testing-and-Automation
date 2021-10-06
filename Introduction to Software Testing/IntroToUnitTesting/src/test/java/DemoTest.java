/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
public class DemoTest {
	
	@Test
	public void testIsTriangle1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void testIsTriangle2() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}
	
    @Test
    public void testIsTriangle3() {
        assertTrue(Demo.isTriangle(5, 13, 12));
    }
	    
    @Test
    public void testIsTriangle4() {
    	assertTrue(Demo.isTriangle(12, 5, 13));
    }
    
    @Test
    public void testIsTriangle5() {
        assertTrue(Demo.isTriangle(12, 13, 5));
    }
    @Test
	public void testIsTriangle6() {
		assertTrue(Demo.isTriangle(0.5,1,0.5));
	}
	
	@Test
	public void testIsTriangle7() {
		assertTrue(Demo.isTriangle(0.5,0.5,1));
	}
	
	@Test
	public void testIsTriangle8() {
		assertTrue(Demo.isTriangle(1,0.5,0.5));
	}
	    
    @Test
    public void testIsNotTriangle1() {
        assertFalse(Demo.isTriangle(5, 7, 13));
    }
	    
    @Test
    public void testIsNotTriangle2() {
        assertFalse(Demo.isTriangle(5, 13, 7));
    }
	    
    @Test
    public void testIsNotTriangle3() {
        assertFalse(Demo.isTriangle(13, 5, 7));
    }
	    
    @Test
    public void testIsNotTriangle4() {
        assertFalse(Demo.isTriangle(13,7, 5));
    }
	    
    @Test
    public void testIsNotTriangle5() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }
	    
    @Test
    public void testIsNotTriangle7() {
        assertFalse(Demo.isTriangle(5, 9, 3));
    }
	    
    @Test
    public void testIsNotTriangle8() {
        assertFalse(Demo.isTriangle(1, 2, -1));
    }
	
	@Test
	public void testMainInput1() {
		String input = "5\\n12\\n13\\n";
		
		// Redirections for user input
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		// Invoke main
		//String[] args = {};
		//Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is not a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput,out.toString());
	}

}
