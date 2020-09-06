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

        output += (String.format("Please eneter 3 numbers separated by spaces > "));

        if(n1 == n2 || n1 == n3 || n2 < n1 && n1 < n3 || n3 < n1 && n1 < n2){
            return n1;
        } else if(n2 == n3 || n1 < n2 && n2 < n3 || n3 < n2 && n2 < n1){
            return n2;
        }         else if(n1 < n3 && n3 < n2){
            return n3;
        }
        //dgw
        return -1;
    }
}