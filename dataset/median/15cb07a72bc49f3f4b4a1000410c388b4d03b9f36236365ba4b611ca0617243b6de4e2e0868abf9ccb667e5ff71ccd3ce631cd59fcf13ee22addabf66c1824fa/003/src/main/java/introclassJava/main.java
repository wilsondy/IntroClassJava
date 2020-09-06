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

    public int exec (int frst, int scnd, int thrd) throws Exception {
        int  cmp1, cmp2, med;
        output += (String.format("Please enter 3 numbers separated by spaces > "));

        if(frst <= scnd){
            cmp1 = frst;
        } else {
            cmp1 = scnd;
        }
        if(scnd <= thrd){
            cmp2 = scnd;
        } else {
            cmp2 = thrd;
        }
        if(cmp1 >= cmp2){
            med = cmp1;
        } else {
            med = cmp2;
        }
        return med;
    }
}