package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000 mainClass = new digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000();
		String expected = "Enter an integer >  4 3 2 1 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000 mainClass = new digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000();
		String expected = "Enter an integer >  6 7 8 -9 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("-9876");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000 mainClass = new digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000();
		String expected = "Enter an integer >  2 7 2 0 3 7 3 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("3730272");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000 mainClass = new digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000();
		String expected = "Enter an integer >  8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("8");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000 mainClass = new digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000();
		String expected = "Enter an integer >  4 7 3 9 8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("89374");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000 mainClass = new digits_313d572e1f050451c688b97510efa105685fa275a8442f9119ce9b3f85f46e234cdf03593568e19798aed6b79c66f45c97be937d09b6ff9544f0f59162538575_000();
		String expected = "Enter an integer >  6 6 6 6 6 6 6 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("6666666");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}