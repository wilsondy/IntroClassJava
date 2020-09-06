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
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        int A, B, C;
        int Small, Large;
        int Median;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
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
        output += (String.format("%d is the median\n", Median));
        if(true)return;;
    }
}