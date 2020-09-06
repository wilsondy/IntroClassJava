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
        float[] data, temp;
        output += (String.format("Please enter three numbers separated by spaces > "));
        ;
        while(!((data[1] <= data[2]) && (data[2] <= data[3]))){
            if(data[2] <= data[1]){
                temp = data[2];
                data[2] = data[1];
                data[1] = temp;
            }
            if(data[3] <= data[2]){
                temp = data[3];
                data[3] = data[2];
                data[2] = data[3];
            }
        }
        output += (String.format("%.0f is the median\n", data[2]));
        if(true)return;;
    }
}