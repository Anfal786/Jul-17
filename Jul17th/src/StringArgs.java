
public class StringArgs {

	public static void main(String[] args) {
		System.out.println("Length: "+args.length);
		int sum=0;
		
		for(String s : args)
			sum+=Integer.parseInt(s);
		System.out.println("Sum="+sum);
	}

}
