package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_013 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_013 mainClass = new median_9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_013();
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
        DoubleObj n1 = new DoubleObj(), n2 = new DoubleObj(), n3 = new DoubleObj(), median = new DoubleObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextDouble();
        n2.value = scanner.nextDouble();
        n3.value = scanner.nextDouble();
        if(n1.value >= n2.value || n1.value >= n3.value){
            if(n1.value >= n3.value && n1.value >= n2.value){
                if(n2.value >= n3.value){
                    median.value = n2.value;
                } else {
                    median.value = n3.value;
                }
            } else {
                median.value = n1.value;
            }
        } else if(n2.value >= n3.value){
            median.value = n3.value;
        }         else {
            median.value = n2.value;
        }
        output += (String.format("%.0f is the median\n", median.value));
        if(true)return;;
    }
}