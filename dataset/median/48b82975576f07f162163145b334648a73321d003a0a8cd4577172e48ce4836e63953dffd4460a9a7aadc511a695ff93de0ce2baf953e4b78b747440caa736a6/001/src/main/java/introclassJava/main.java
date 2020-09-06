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
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if((a <= b && b <= c) || (c <= b && b <= a)){
            output += (String.format("%d is the median\n", b));
        } else if((b <= a && a <= c) || (c <= a && a <= b)){
            output += (String.format("%d is the median\n", a));
        }         else {
            output += (String.format("%d is the median\n", c));
        }
        if(true)return;;
    }
}