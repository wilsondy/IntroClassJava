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
        int a, b, c, median;
        output += (String.format("Enter first integer > "));
        a = scanner.nextInt();
        output += (String.format("Enter second integer > "));
        b = scanner.nextInt();
        output += (String.format("Enter third integer > "));
        c = scanner.nextInt();
        if((a >= b && b >= c) || (a <= b && b <= c)){
            output += (String.format("%d is the median\n", b));
        } else if((b >= a && a >= c) || (c <= a && a <= b)){
            output += (String.format("%d is the median\n", a));
        }         else if((a >= c && c >= b) || (a <= c && c <= b)){
            output += (String.format("%d is the median\n", c));
        }         else {
            if(true)return;;
        }
        if(true)return;;
    }
}