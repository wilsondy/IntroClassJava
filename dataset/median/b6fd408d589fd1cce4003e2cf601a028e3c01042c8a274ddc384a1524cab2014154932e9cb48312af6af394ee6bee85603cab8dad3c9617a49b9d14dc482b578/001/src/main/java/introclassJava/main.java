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
        int n1, n2, n3, temp;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        if(n2 < n1){
            temp = n2;
            n2 = n1;
            n1 = temp;
        }
        if((n3 < n2) && (n3 >= n1)){
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        output += (String.format("%d is the median\n", n2));
        if(true)return;;
    }
}