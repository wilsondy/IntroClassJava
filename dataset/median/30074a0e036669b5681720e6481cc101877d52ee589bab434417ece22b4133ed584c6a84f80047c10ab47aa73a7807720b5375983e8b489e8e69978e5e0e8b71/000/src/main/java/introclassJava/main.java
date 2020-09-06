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

        output += (String.format("Please enter 3 numbers seperated by spaces > "));

        if((a < b && b < c) || (b < a && c < b)){
            return b;
        }
        if((b < a && a < c) || (a < b && c < a)){
            return a;
        }
        if((a < c && c < b) || (b < c && c < a)){
            return c;
        }
        //dgw
        return -1;
    }
}