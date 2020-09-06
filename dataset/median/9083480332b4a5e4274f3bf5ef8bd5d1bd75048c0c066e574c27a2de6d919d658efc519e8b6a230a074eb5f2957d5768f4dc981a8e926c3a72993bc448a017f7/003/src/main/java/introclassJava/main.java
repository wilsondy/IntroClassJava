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

        if((a >= b && b >= c) || (a <= b && b <= c)){
        return b;
        } else if((b >= a && a >= c) || (c <= a && a <= b)){
        return a;
        }         else if((a >= c && c >= b) || (a <= c && c <= b)){
            return c;
        }         else {
            return -1;
        }

    }
}