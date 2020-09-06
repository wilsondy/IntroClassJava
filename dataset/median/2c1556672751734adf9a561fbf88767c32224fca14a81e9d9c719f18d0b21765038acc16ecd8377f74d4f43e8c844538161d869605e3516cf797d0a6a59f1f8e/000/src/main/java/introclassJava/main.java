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
        int i1, i2, i3;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        i1 = scanner.nextInt();
        i2 = scanner.nextInt();
        i3 = scanner.nextInt();
        if((i1 >= i2 && i1 <= i3) || (i1 == i2 && i1 == i3) || (i1 > i2 && i1 < i3)){
            output += (String.format("%d is the median\n", i1));
        } else if((i2 >= i1 && i2 <= i3) || (i2 == i1 && i2 == i3) || (i2 > i1 && i2 < i3)){
            output += (String.format("%d is the median\n", i2));
        }         else if((i3 >= i2 && i3 <= i1) || (i3 == i2 && i3 == i1) || (i3 > i2 && i3 < i1)){
            output += (String.format("%d is the median\n", i3));
        }
        if(true)return;;
    }
}