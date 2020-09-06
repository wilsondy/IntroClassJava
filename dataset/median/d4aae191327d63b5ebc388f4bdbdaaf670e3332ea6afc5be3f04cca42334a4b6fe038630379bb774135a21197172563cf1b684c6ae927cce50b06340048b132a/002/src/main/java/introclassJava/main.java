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

        if((a > b) && (b > c)){
        return b;
        }
        if((a > b) && (a > c)){
            if(c > b){
                return c;
            }
        }
        if((b > a) && (a > c)){
            return a;
        }
        if((b > a) && (b > c)){
            if(c > a){
                return c;
            }
        }
        if((c > a) && (a > b)){
            return a;
        }
        if((c > a) && (c > b)){
            if(b > a){
                return b;
            }
        }
        if(a == b){
            return b;
        } else if(a == c){
        return c;
        }         else if(b == c){
            return b;
        }
        return -1;
    }
}