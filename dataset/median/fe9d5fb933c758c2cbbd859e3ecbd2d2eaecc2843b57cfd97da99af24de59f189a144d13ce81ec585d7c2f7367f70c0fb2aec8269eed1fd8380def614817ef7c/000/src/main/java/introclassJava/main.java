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
		
		System.out.println(mainClass.output);
	}

    public int exec (int num1, int num2, int num3) throws Exception {
        int median, big, small;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        
        if(num1 > num2){
            small = num2;
            big = num1;
        } else {
            big = num2;
            small = num2;
        }
        if(num3 > big){
            median = big;
        } else if(num3 < small){
            median = small;
        }         else {
            median = num3;
        }
        return median;
    }
}