package digitSumChallenge;

public class DigitSumChallenge {

	public static void main(String[] args) {
		
		System.out.println(sumDigits(455));
	}
	
	public static int sumDigits(int number) {
		int sumOfAllDigits = 0;
		if (number<10) {
			return -1;
		}
		int hundreds = (number / 100);
		System.out.println("hundreds " + hundreds);
		hundreds = (hundreds * 100);
		int tens = (number - hundreds) / (10);
		System.out.println("tens " + tens);
		tens = tens * 10;
		int ones = (number - hundreds - tens);
		System.out.println(" ones " + ones);
		hundreds = hundreds / 100;
		tens = tens / 10;
		
		sumOfAllDigits = hundreds + tens + ones;
		return sumOfAllDigits;
	}
}
