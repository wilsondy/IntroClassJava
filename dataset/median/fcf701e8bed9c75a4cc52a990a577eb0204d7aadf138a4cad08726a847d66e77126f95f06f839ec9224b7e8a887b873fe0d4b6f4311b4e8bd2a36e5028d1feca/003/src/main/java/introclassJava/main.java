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

        output += (String.format("Please enter 3 numbers separated by spaces > "));

        while(a <= b && a <= c){
            if(b < c){
        return b;
            } else {
                return c;
            }
        }
        while(b <= a && b <= c){
            if(a < c){
                return a;
            } else {
                return c;
            }
        }
        while(c <= a && c <= b){
            if(b < a){
                return b;
            } else {
                return a;
            }
        }
        return -1;
    }
}