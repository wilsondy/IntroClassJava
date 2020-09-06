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

    public int exec (int A, int B, int C) throws Exception {
        int  small=0, large=0, median=0;
        output += (String.format("Please enter 3 numberss separated by spaces > "));

        if(A > B){
            small = B;
            large = A;
        } else if(A < B){
            small = A;
            large = B;
        }
        if(C > large){
            median = large;
        } else if(C < small){
            median = small;
        }         else {
            median = C;
        }
        return median;
    }
}