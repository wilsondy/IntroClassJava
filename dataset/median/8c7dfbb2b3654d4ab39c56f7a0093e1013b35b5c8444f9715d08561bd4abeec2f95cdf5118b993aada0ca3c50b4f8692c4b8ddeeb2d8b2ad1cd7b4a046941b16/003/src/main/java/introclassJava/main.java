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
	    //dgw added initalization to allow compilation
        int d=0;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if((a < b && b < c) || (c < b && b < a)){
            d = b;
        }
        if((c < a && a < b) || (b < a && a < c)){
            d = a;
        }
        if((b < c && c < a) || (a < c && c < b)){
            d = c;
        }
        return d;
    }
}