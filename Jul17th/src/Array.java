import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int a[] = { -1, 1, 2, 3, 4, 5, 26, 6, -87 };
		String[] name = { "MAK", "KAM", "SAM", "DAN", "GURU" };

		System.out.println("Correct:");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

		System.out.println("\nReverse:");
		for (int i = a.length - 1; i >= 0; i--)
			System.out.println(a[i]);

		for (int i = 0;; i++) {
			if (a[i] == 26) {
				System.out.println("\n26 Found");
				break;
			} else if (i == a.length - 1) {
				System.out.println("\n26 Not foundFound");
				break;
			}

		}

		// boolean f=false;
		// for(int i=0;i<a.length;i++) {
		// if(a[i]==26) {
		// f=true;
		// break;
		// }
		// }
		// if(f)
		// System.out.println("\nFound");
		// else
		// System.out.println("\nNot Found");

		int max = a[0], min = a[0], sum = 0, eSum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (a[i] % 2 == 0)
				eSum += a[i];
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("\nMaximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Sum: " + sum);
		System.out.println("Even Sum: " + eSum);
		System.out.println();

		boolean guruFound = false;
		int pos = -1;
		for (int i = 0; i < name.length; i++)
			if (name[i].compareToIgnoreCase("guru") == 0) {
				guruFound = true;
				pos = i + 1;
			}
		if (guruFound)
			System.out.println("Guru is in Class at " + pos);
		else
			System.out.println("Guru is Not in this class");

		String[] basket1 = { "red", "blue", "green", "red", "red" };
		String[] basket2 = { "blue", "blue", "green", "red", "red" };
		int redCount = 0;
		for (int i = 0; i < 5; i++) {
			if (basket1[i].compareToIgnoreCase("red") == 0)
				redCount++;
			if (basket2[i].compareToIgnoreCase("red") == 0)
				redCount++;
		}
		System.out.println("\nRed Color Count: " + redCount);

		String[] country = { "India", "USA", "Dubai" };
		String[] capital = { "Delhi", "Washington", "Abudubai" };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Country name: ");
		String countryName = sc.next();
		sc.close();
		String capitalName = null;
		for (int i = 0; i < country.length; i++)
			if (country[i].compareToIgnoreCase(countryName) == 0)
				capitalName = capital[i];
		if (capitalName == null)
			System.out.println("Country " + countryName + " not found!!!");
		else
			System.out.println("\nCapital of " + countryName + " is " + capitalName);

	}
}