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
        int x, y, z, temp;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if(x >= y){
            temp = x;
            x = y;
            y = temp;
        }
        if(x >= z){
            temp = x;
            x = z;
            z = temp;
        }
        if(y >= z){
            x = z;
        } else {
            x = y;
        }
        output += (String.format("%d is the median\n", x));
        if(true)return;;
    }
}