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

        output += (String.format("Please enter 3 numbers separated by spaces  > "));

        if((a < c) && (a > b)){
        return a;
        } else if((a < b) && (a > c)){
            return a;
        }
        if((b < a) && (b > c)){
            return b;
        } else if((b > a) && (b < c)){
            return b;
        }
        if((c > a) && (c < b)){
            return c;
        } else if((c < a) && (c > b)){
            return c;
        }
        return -1;
    }
}