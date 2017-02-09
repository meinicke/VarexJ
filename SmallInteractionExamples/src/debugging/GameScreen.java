package debugging;

import gov.nasa.jpf.annotation.Conditional;

public class GameScreen {

	@Conditional
	static boolean blue = true;
	@Conditional
	static boolean yellow = true;
	@Conditional
	static boolean green = true;

	int totalScore = 0;
	int penalty;// blue
	final int TIME_BONUS = 2;// green

	final int PERFECT_CUREVE = 4;
	final int PERFECT_STRAIGHT = 1;

	private void setScore(int score) {// yellow
		if (score >= 0) {
			totalScore = score;
		} else {
			totalScore = 0;
		}
	}

	public void setPenalty(int penalty) {// blue
		this.penalty = penalty;
	}

	void gc_computeLevelScore() {
		assert totalScore == 0;
		totalScore = PERFECT_CUREVE + PERFECT_STRAIGHT;

		if (green) {
			totalScore += TIME_BONUS;// green
		}
		if (blue) {
			totalScore -= penalty;
		}

		if (blue) {
			assert totalScore < 0;
		}
		if (yellow) {
			setScore(totalScore);
		}
		if (blue) {
			assert totalScore < 0;
		}
	}

	public static void main(String[] args) {
		GameScreen game = new GameScreen();
		if (blue) {
			game.setPenalty(10);// blue
		}
		game.gc_computeLevelScore();

	}
}
