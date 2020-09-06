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
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        if(A == B && A == C){
            output += (String.format("%d is the median\n", A));
        } else if(A > B && A < C){
            output += (String.format("%d is the median\n", A));
        }         else if(A > C && A < B){
            output += (String.format("%d is the median\n", A));
        }         else if(B > C && B < A){
            output += (String.format("%d is the median\n", B));
        }         else if(B > A && B < C){
            output += (String.format("%d is the median\n", B));
        }         else if(C > A && C < B){
            output += (String.format("%d is the median\n", C));
        }         else if(C > B && C < A){
            output += (String.format("%d is the median\n", C));
        }         else if(A == B){
            output += (String.format("%d is the median\n", B));
        }         else if(A == C){
            output += (String.format("%d is the median\n", C));
        }         else if(C == B){
            output += (String.format("%d is the median\n", C));
        }
        if(true)return;;
    }
}