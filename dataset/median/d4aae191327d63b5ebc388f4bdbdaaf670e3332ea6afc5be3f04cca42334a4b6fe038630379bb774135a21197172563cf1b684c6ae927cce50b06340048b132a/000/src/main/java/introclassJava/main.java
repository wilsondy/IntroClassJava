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
        if((a > b) && (b > c)){
            output += (String.format("%d is the median\n", b));
        }
        if((a > b) && (a > c)){
            if(c > b){
                output += (String.format("%d is the median\n", c));
            }
        }
        if((b > a) && (a > c)){
            output += (String.format("%d is the median\n", a));
        }
        if((b > a) && (b > c)){
            if(c > a){
                output += (String.format("%d is the median\n", c));
            }
        }
        if((c > a) && (a > b)){
            output += (String.format("%d is the median\n", a));
        }
        if((c > a) && (c > b)){
            if(b > a){
                output += (String.format("%d is the median\n", b));
            }
        }
        if(true)return;;
    }
}