package battleship;

public class Application {
	
	public static void main(String[] args) {
		int numOfGuesses = 0;    //var that checks how many guesses
		GameHelper helper =  new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom(); //dotcom object
		int randomNum = (int) (Math.random() * 5); //make a random number for the first cell and set dot com
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		theDotCom.setLocationCells(locations); //give the dotcom a location in the array
		boolean isAlive = true; //tracks whether game is still alive
		
		while(isAlive == true) {
			String guess = helper.getUserInput("enter a number"); //ask user to input string
			String result = theDotCom.checkYourself(guess); //ask the dot com to check the guess save the rsult in a string
			numOfGuesses++;  //increment guess count
			if (result.equals("kill")) { //if a kill print guess count if alive, loop
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}

	

}
