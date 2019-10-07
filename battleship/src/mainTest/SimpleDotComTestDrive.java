package mainTest;

public class SimpleDotComTestDrive {
	
	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom(); //instantiate SimpleDotCom object
		int[] locations = {2,3,4}; //array for location of DotCom, 3 units out of 7
		dot.setLocationCells(locations); //invode setter method on the dot com
		
		String userGuess = "2"; //fake user guess
		String result = dot.checkYourself(userGuess); //invoke checkYourself() method on dot com object and pass
														//the fake guess
		String testResult = "failed";
		if (result.equals("hit")) {  
			testResult = "passed";  //if fake guess (2) gives a hit it is passing
		}
		System.out.println(testResult);
	}

}
