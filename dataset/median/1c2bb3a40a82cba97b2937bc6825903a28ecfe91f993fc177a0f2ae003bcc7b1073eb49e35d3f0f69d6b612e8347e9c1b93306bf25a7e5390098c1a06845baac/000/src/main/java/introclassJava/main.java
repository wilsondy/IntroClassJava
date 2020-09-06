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
        int x, y, z;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if(x == y){
            output += (String.format("%d is the median\n", x));
        }
        if(x == z){
            output += (String.format("%d is the median\n", x));
        }
        if(y == z){
            output += (String.format("%d is the median\n", y));
        }
        if(true)return;;
    }
}