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
        int first, second, third, ans;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        first = scanner.nextInt();
        second = scanner.nextInt();
        third = scanner.nextInt();
        if((first > second && first < third) || (first > third && first < second)){
            ans = first;
        } else if((second > first && second < third) || (second > third && second < first)){
            ans = second;
        }         else {
            ans = third;
        }
        output += (String.format("%d is the median\n", ans));
        if(true)return;;
    }
}