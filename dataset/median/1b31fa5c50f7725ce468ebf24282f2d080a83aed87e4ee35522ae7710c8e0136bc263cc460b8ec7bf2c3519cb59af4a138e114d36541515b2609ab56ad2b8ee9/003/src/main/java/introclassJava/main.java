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

    public int exec (int num1, int num2, int num3) throws Exception {

        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if((((num1 >= num2) && (num1 <= num3))) || ((num1 >= num3) && (num1 <= num2))){
            return num1;
        } else if((((num2 >= num1) && (num2 <= num3))) || ((num2 >= num3) && (num2 <= num1))){
            return num2;
        }         else {
            return num3;
        }


    }
}