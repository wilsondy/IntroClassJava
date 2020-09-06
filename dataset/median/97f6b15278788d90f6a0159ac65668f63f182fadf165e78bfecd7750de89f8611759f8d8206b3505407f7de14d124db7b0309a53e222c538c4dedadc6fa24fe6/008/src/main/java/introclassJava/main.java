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
        int a, b, c, median;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a > b && a < c){
            median = a;
        } else if(a < b && a > c){
            median = a;
        }         else if(b > a && b < c){
            median = b;
        }         else if(b < a && b > c){
            median = b;
        }         else if(c > a && c < b){
            median = c;
        }         else if(c < a && c > b){
            median = c;
        }         else if((a == b) || (a == c)){
            median = a;
        }         else if(b == c){
            median = c;
        }
        output += (String.format("%d is the median\n", median));
        if(true)return;;
    }
}