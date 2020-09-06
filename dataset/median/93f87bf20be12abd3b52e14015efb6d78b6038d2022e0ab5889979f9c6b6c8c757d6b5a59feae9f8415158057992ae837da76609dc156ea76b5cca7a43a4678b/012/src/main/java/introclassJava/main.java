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
        int int1, int2, int3;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        int1 = scanner.nextInt();
        int2 = scanner.nextInt();
        int3 = scanner.nextInt();
        if(((int1 <= int2) && (int1 >= int3)) || ((int1 <= int2) && (int1 >= int3))){
            output += (String.format("%d is the median\n", int1));
        } else if((((int2 <= int1)) && (int2 >= int3)) || ((int2 <= int3) && (int2 >= int1))){
            output += (String.format("%d is the median\n", int2));
        }         else if(((int3 <= int1) && (int3 >= int2)) || ((int3 <= int2) && (int3 >= int1))){
            output += (String.format("%d is the median\n", int3));
        }
        if(true)return;;
    }
}