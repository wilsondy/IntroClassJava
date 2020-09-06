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
        int a, b, c, d;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a < b && a > c || a > b && a < c){
            d = a;
        } else if(b > a && b < c || b < a && b > c){
            d = b;
        }         else {
            d = c;
        }
        output += (String.format("%d is the median\n", d));
        if(true)return;;
    }
}