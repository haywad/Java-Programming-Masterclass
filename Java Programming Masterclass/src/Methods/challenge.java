package Methods;

public class challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bacon", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mason", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Salmon", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lemon", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(59);
        displayHighScorePosition("Damon", highScorePosition);

	}
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position"
				+ highScorePosition + " on the high score table.");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
//		if (playerScore >= 1000) {
//			return 1;
//		}
//		else if (playerScore >= 500) {
//			return 2;
//		}
//		else if (playerScore >= 100) {
//			return 3;
//		}
//		else {
//			return 4;
//		}
		int position = 4;
		if (playerScore >= 1000) {
			position = 1;
		}
		else if (playerScore >= 500) {
			position = 2;
		}
		else if (playerScore >= 100) {
			position = 3;
		}
		return position;
	}

}
