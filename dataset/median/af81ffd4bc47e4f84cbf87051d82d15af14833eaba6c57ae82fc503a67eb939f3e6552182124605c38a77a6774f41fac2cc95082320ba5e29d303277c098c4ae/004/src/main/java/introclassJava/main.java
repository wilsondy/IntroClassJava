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
        double first, second, third;
        double median;
        double comp_fir, comp_sec, comp_thi;
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        third = scanner.nextDouble();
        median = (Math.abs(first) + Math.abs(second) + Math.abs(third)) / 3;
        comp_fir = Math.abs(first - median);
        comp_sec = Math.abs(second - median);
        comp_thi = Math.abs(third - median);
        if(comp_fir < comp_sec && comp_fir < comp_thi){
            output += (String.format("%.0f is the median\n", first));
        } else if(comp_sec < comp_fir && comp_sec < comp_thi){
            output += (String.format("%.0f is the median\n", second));
        }         else if(comp_thi < comp_fir && comp_thi < comp_sec){
            output += (String.format("%.0f is the median\n", third));
        }
        if(true)return;;
    }
}