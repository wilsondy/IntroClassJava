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
        int  m=0;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if((a >= b && a <= c) || (a >= c && a <= b)){
            m = b;
        } else if((b >= a && b <= c) || (b >= c && b <= a)){
            m = b;
        }         else if((c >= a && c <= b) || (c >= b && c <= a)){
            m = c;
        }
        return m;
    }
}