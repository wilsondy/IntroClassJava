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
        double first, second, third;
        output += (String.format("Please enter 3 numbers seperated by spaces > "));
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        third = scanner.nextDouble();
        if((first > second && first < third) || (first < second && first > third)){
            output += (String.format("%.0f is the median\n", first));
        }
        if((second > first && second < third) || (second < first && second > third)){
            output += (String.format("%.0f is the median\n", second));
        }
        if((third > first && third < second) || (third < first && third > second)){
            output += (String.format("%.0f is the median\n", third));
        }
        if(true)return;;
    }
}