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

        int Small, Large;
        int Median;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if(A > B){
            Large = A;
            Small = B;
        } else {
            Large = B;
            Small = A;
        }
        if(C > Large){
            Median = Large;
        } else if(C < Small){
            Median = Small;
        }         else {
            Median = C;
        }
return Median;
    }
}