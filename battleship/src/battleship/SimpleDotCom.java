package battleship;

import java.util.ArrayList;

public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits = 0;
		
	private  ArrayList<String> locationCells;
	
	
	
			locationCells = loc;
		
		public String checkYourself(String stringGuess) {
		
		int guess = Integer.parseInt(stringGuess); //convert the string to an int
		String result = "miss"; //make a variable to hold the result for return, miss is default
		int index = locationCells.indexOf(userInput);
		if (index>=0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
//		for (int cell : locationCells) {  //repeat with each cell in the location cells array
//			if (guess == cell) { //compare user guess to this element in array
//				result = "hit";
//				numOfHits++;
//				break;
//			}
			
		}
		
		
		if (numOfHits == locationCells.length) {
			result = "kill"; //checks to see if we hit 3 times and got a kill
		}
		System.out.println(result); //display result
		return result;
	}

	
	
	

}
