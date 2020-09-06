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
        int A, B, C, small, large, median;
        output += (String.format("Please enter 3 numberss separated by spaces > "));
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
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
        output += (String.format("%d is the median\n", median));
        if(true)return;;
    }
}