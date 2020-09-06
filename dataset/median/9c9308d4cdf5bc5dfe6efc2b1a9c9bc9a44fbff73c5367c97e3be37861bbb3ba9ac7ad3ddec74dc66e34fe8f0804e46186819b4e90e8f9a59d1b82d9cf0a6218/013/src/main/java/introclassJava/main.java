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

    public int exec (double n1, double n2, double n3) throws Exception {
        double median;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if(n1 >= n2 || n1 >= n3){
            if(n1 >= n3 && n1 >= n2){
                if(n2 >= n3){
                    median = n2;
                } else {
                    median = n3;
                }
            } else {
                median = n1;
            }
        } else if(n2 >= n3){
            median = n3;
        }         else {
            median = n2;
        }
        //dgw
        return (int)median;
    }
}