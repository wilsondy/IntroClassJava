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

    public int exec (int i1, int i2, int i3) throws Exception {

        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if((i1 >= i2 && i1 <= i3) || (i1 == i2 && i1 == i3) || (i1 > i2 && i1 < i3)){
            return 1;
        } else if((i2 >= i1 && i2 <= i3) || (i2 == i1 && i2 == i3) || (i2 > i1 && i2 < i3)){
            return i2;
        }         else if((i3 >= i2 && i3 <= i1) || (i3 == i2 && i3 == i1) || (i3 > i2 && i3 < i1)){
            return i3;
        }
        //dgw added to allow compilation
        return -1;
    }
}