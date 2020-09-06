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

    public int exec (int a, int b, int c) throws Exception { 
	    
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        
        if((a <= b && b <= c) || (c <= b && b <= a)){
            return b;
        } else if((b <= c && c <= a) || (a <= c && c <= b)){
            return c;
        }         else if((c <= a && a <= b) || (b <= a && a <= c)){
            return a;
        }
        return -1;
    }
}