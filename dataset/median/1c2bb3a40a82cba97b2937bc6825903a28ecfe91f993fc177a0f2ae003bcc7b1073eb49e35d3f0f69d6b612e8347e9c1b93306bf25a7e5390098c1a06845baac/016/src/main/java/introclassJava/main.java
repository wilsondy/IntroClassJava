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
         int temp;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if(x >= y){
            temp = x;
            x = y;
            y = temp;
        }
        if(x >= z){
            temp = x;
            x = z;
            z = temp;
        }
        if(y >= z){
            x = z;
        } else {
            x = y;
        }
        return x;
    }
}