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

        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if(A == B && A == C){
            return A;
        } else if(A > B && A < C){
            return A;
        }         else if(A > C && A < B){
            return A;
        }         else if(B > C && B < A){
            return B;
        }         else if(B > A && B < C){
            return B;
        }         else if(C > A && C < B){
            return C;
        }         else if(C > B && C < A){
            return C;
        }         else if(A == B){
            return B;
        }         else if(A == C){
            return C;
        }         else if(C == B){
            return C;
        }
        return -1;
    }
}