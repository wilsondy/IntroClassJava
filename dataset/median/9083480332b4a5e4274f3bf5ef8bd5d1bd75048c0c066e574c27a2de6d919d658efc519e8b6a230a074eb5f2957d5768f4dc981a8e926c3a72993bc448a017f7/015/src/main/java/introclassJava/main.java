package introclassJava;


public class main {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		main mainClass = new main();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		System.out.println(mainClass.output);
	}

    public int exec (int a, int b, int c) throws Exception {
        int  median;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if((b >= a && a >= c) || (c <= a && a <= b) || (a < b && a < c)){
        return a;
        } else if((a >= b && b >= c) || (a <= b && b <= c) || (b < c && b < a)){
            return b;
        }         else if((a >= c && c >= b) || (a <= c && c <= b) || (c < a && c < b)){
            return c;
        }         else {
            return -1;
        }

    }
}