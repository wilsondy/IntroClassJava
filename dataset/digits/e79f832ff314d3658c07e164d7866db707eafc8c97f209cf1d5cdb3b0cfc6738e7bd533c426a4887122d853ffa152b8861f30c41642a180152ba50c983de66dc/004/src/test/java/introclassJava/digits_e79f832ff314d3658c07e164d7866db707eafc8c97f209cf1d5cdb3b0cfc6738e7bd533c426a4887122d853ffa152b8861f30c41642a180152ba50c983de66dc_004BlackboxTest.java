package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 mainClass = new digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004();
		String expected = "Enter an integer >  4 3 2 1 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 mainClass = new digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004();
		String expected = "Enter an integer >  6 7 8 -9 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("-9876");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 mainClass = new digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004();
		String expected = "Enter an integer >  2 7 2 0 3 7 3 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("3730272");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 mainClass = new digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004();
		String expected = "Enter an integer >  8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("8");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 mainClass = new digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004();
		String expected = "Enter an integer >  4 7 3 9 8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("89374");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 mainClass = new digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004();
		String expected = "Enter an integer >  6 6 6 6 6 6 6 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("6666666");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}