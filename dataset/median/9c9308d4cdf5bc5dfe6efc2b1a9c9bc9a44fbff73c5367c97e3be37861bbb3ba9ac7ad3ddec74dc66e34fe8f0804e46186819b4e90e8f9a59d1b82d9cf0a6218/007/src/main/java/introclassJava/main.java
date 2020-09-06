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
        double n1, n2, n3, median;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();
        if(n1 >= n2 || n1 >= n3)
    {
            if(n2 >= n3 && n1 >= n2)
    {
                median = n2;
            } else {
                median = n1;
            }
        } else if(n2 >= n3)
    {
            median = n3;
        }         else {
            median = n2;
        }
        output += (String.format(" %.0f is the median\n", median));
        if(true)return;;
    }
}