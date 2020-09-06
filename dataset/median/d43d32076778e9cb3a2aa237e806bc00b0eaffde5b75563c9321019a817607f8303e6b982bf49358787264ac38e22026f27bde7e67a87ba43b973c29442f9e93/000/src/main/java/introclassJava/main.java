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

    public int exec (int int1, int int2, int int3) throws Exception {

        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if((int1 < int2 && int1 > int3) || (int1 > int2 && int1 < int3)){
            return int1;
        } else if((int2 < int3 && int2 > int1) || (int2 > int3 && int2 < int1)){
            return int2;
        }         else {
            return int3;
        }


    }
}