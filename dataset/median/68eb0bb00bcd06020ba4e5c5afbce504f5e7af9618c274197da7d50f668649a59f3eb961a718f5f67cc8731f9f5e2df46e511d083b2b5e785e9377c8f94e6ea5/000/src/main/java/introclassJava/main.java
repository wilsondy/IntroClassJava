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

    public int exec ( int x, int y, int z) throws Exception {

        output += (String.format("Please enter 3 numbers separated by space  > "));

        if(x >= y && x <= z){
        return x;
        } else if(y >= x && y <= z){
            return y;
        }         else {
            return z;
        }

    }
}