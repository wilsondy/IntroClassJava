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

    public int exec (int n1, int n2, int n3) throws Exception {
        int small;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if(n1 < n2){
            small = n1;
            if(small > n3){
                return n1;
            } else if(n3 > n2){
                return n2;
            }             else {
                return n3;
            }
        } else {
            small = n2;
            if(small > n3){
                return n2;
            } else if(n3 > n1){
                return n3;
            }             else {
                return n1;
            }
        }

    }
}