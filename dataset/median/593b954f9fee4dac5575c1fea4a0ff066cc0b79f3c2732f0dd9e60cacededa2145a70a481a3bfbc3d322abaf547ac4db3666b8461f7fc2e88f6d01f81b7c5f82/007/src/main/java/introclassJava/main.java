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
        int num1, num2, num3, median;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)){
            median = num1;
        } else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)){
            median = num2;
        }         else if((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)){
            median = num3;
        }
        output += (String.format("%d is the median\n", median));
        if(true)return;;
    }
}