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
        int a, b, c, temp1, temp2;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        temp1 = a;
        temp2 = b;
        if(a > c){
            a = b;
            b = temp1;
        }
        if(b > c){
            b = c;
            c = temp2;
        }
        if(a > b){
            a = b;
            b = temp1;
        }
        output += (String.format("%d is the median", b));
        if(true)return;;
    }
}