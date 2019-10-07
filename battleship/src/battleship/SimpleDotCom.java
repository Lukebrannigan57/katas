package battleship;


public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits = 0;

	
		
		public void setLocationCells(int[] locs) {
			locationCells = locs;
		}
		public String checkYourself(String stringGuess) {
		
		int guess = Integer.parseInt(stringGuess); //convert the string to an int
		String result = "miss"; //make a variable to hold the result for return, miss is default
		
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

	
	
	

}
