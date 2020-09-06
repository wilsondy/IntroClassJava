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

    public int exec (int first, int second, int third) throws Exception {
         int ans;
        output += (String.format("Please enter 3 numbers separeted by spaces > "));

        if((first > second && first < third) || (first > third && first < second)){
            ans = first;
        } else if((second > first && second < third) || (second > third && second < first)){
            ans = second;
        }         else {
            ans = third;
        }
        return ans;
    }
}