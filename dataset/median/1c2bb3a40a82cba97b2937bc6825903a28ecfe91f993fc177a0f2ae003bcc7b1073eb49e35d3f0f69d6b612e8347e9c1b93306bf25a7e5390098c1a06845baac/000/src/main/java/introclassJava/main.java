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

    public int exec (int x, int y, int z) throws Exception {

        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if(x == y){
            return x;
        }
        if(x == z){
            return x;
        }
        if(y == z){
            return y;
        }
        //dgw added to make it compile
        return -1;
    }
}