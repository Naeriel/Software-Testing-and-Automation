import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class DemoCircleTest {

	@Test
	public void testMainInput1() {
		String input = "1\n";
		
		// Redirections for user input
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		// Invoke main
		String[] args = {};
		DemoCircle.main(args);
		
		String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
		consoleOutput += "For a circle with radius 1.0" + System.getProperty("line.separator");
		consoleOutput += " the circumference is 6.283185307179586" + System.getProperty("line.separator");
		consoleOutput += " and the area is 3.141592653589793." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput,out.toString());
	}
	
	@Test
	public void testMainInput3() {
		String input = "3\n";
		
		// Redirections for user input
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		// Invoke main
		String[] args = {};
		DemoCircle.main(args);
		
		String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
		consoleOutput += "For a circle with radius 3.0" + System.getProperty("line.separator");
		consoleOutput += " the circumference is 18.84955592153876" + System.getProperty("line.separator");
		consoleOutput += " and the area is 28.274333882308138." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput,out.toString());
	}

}
