package javaMasterclass;

public class WhileAndDoWhile {
	
	public static void main(String[] args) {
//		int count = 0;
//		while (count != 6){
//			System.out.println("count value is " +  count);
//			count++;
//			
//			
//		}
//		count = 0;
//		do {
//			
//			System.out.println("count value is " + count);
//			count ++;
//			
//		}
//		while (count != 6);
		
		int number = 4;
		int finishNumber = 20;
		int count =0;
		
		while (number < finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
				
			} else if (isEvenNumber(number)) {
				System.out.println(number + " is even");
				count ++;
				
			}
			if (count ==5) {
				break;
		}
		
		}
		System.out.println("the number of even numbers is " + count);

		
		
	}

	public static boolean isEvenNumber(int number) {
		
			if (number % 2 == 0) {
				
				return true;
			}else {
				return false;

			
		}
	}
}
