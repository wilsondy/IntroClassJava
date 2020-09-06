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
        int a, b, c;
        output += (String.format("Please enter three integers separated by spaces > "));
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        while(a < b && a < c){
            if(b < c){
                output += (String.format("%d is the median\n", b));
                break;
            } else {
                output += (String.format("%d is the median\n", c));
                break;
            }
        }
        while(b < a && b < c){
            if(a < c){
                output += (String.format("%d is the median\n", a));
                break;
            } else {
                output += (String.format("%d is the median\n", c));
                break;
            }
        }
        while(c < a && c < b){
            if(b < a){
                output += (String.format("%d is the median\n", b));
                break;
            } else {
                output += (String.format("%d is the median\n", a));
                break;
            }
        }
        if(true)return;;
    }
}