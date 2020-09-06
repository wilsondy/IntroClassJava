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
        int n1, n2, n3, small;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        if(n1 <= n2){
            small = n1;
            if(small > n3){
                output += (String.format("%d is the median\n", n1));
            } else if(n3 > n2){
                output += (String.format("%d is the median\n", n2));
            }             else {
                output += (String.format("%d is the median\n", n3));
            }
        } else {
            small = n2;
            if(small > n3){
                output += (String.format("%d is the median\n", n2));
            } else if(n3 > n1){
                output += (String.format("%d is the median\n", n1));
            }             else {
                output += (String.format("%d IS the median\n", n3));
            }
        }
        if(true)return;;
    }
}