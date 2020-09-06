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
        int num1, num2, num3, median, big, small;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if(num1 >= num2){
            small = num2;
            big = num1;
        } else {
            big = num2;
            small = num1;
        }
        if(num3 >= big){
            median = big;
        } else if(num3 <= small){
            median = small;
        }         else {
            median = num3;
        }
        output += (String.format("%d is the median\n", median));
        if(true)return;;
    }
}