package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AllTest {

	@Test(timeout=1000)
	public void test1white() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 0 is the median";
		mainClass.scanner = new java.util.Scanner("0 0 0");


		assertEquals(0,mainClass.exec(0d,0d,0d));
	}
	@Test(timeout=1000)
	public void test2white() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 1 is the median";
		mainClass.scanner = new java.util.Scanner("2 0 1");
		assertEquals(1,mainClass.exec(2d,0d,1d));
	}
	@Test(timeout=1000)
	public void test3white() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 0 is the median";
		mainClass.scanner = new java.util.Scanner("0 0 1");
		assertEquals(0,mainClass.exec(0d,0d,1d));
	}
	@Test(timeout=1000)
	public void test4white() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 0 is the median";
		mainClass.scanner = new java.util.Scanner("0 1 0");
		assertEquals(0,mainClass.exec(0d,1d,0d));
	}
	@Test(timeout=1000)
	public void test5white() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 1 is the median";
		mainClass.scanner = new java.util.Scanner("0 2 1");
		assertEquals(1,mainClass.exec(0d,2d,1d));
	}
	@Test(timeout=1000)
	public void test6white() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 2 is the median";
		mainClass.scanner = new java.util.Scanner("0 2 3");
		assertEquals(2,mainClass.exec(0d,2d,3d));
	}
	@Test(timeout=1000)
	public void test1black() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 6 is the median";
		mainClass.scanner = new java.util.Scanner("2 6 8");
		assertEquals(6,mainClass.exec(2d,6d,8d));
	}
	@Test(timeout=1000)
	public void test2black() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 6 is the median";
		mainClass.scanner = new java.util.Scanner("2 8 6");
		assertEquals(6,mainClass.exec(2d,8d,6d));
	}
	@Test(timeout=1000)
	public void test3black() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 6 is the median";
		mainClass.scanner = new java.util.Scanner("6 2 8");
		assertEquals(6,mainClass.exec(6d,2d,8d));
	}
	@Test(timeout=1000)
	public void test4black() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 6 is the median";
		mainClass.scanner = new java.util.Scanner("6 8 2");
		assertEquals(6,mainClass.exec(6d,8d,2d));
	}
	@Test(timeout=1000)
	public void test5black() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 6 is the median";
		mainClass.scanner = new java.util.Scanner("8 2 6");
		assertEquals(6,mainClass.exec(8d,2d,6d));
	}
	@Test(timeout=1000)
	public void test6black() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 6 is the median";
		mainClass.scanner = new java.util.Scanner("8 6 2");
		assertEquals(6,mainClass.exec(8d,6d,2d));
	}
	@Test(timeout=1000)
	public void test7black() throws Exception {
		main mainClass = new main();
		String expected = "Please enter 3 numbers separated by spaces > 9 is the median";
		mainClass.scanner = new java.util.Scanner("9 9 9");
		assertEquals(9,mainClass.exec(9d,9d,9d));
	}
}