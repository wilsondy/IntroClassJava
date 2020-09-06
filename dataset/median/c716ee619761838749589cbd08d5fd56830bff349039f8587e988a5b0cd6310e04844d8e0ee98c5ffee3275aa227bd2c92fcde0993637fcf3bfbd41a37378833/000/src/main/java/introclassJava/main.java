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

        output += (String.format("Pleaes enter 3 numbers seperated by spaces > "));

        if(A > B && A < C){
        return A;
        }
        if(A > C && A < B){
            return A;
        }
        if(B > C && B < A){
            return B;
        }
        if(B > A && B < C){
            return B;
        }
        if(C > A && C < B){
            return C;
        }
        if(C > B && C < A){
            return C;
        }

        return -1;
    }
}