package bowler;

public class bowler {

	public static final int NUMBER_OF_GAMES = 3;
	private String firstName;
	private String lastName;
	private int score1; 
	private int score2;
	private int score3;

	//mutator methods
	public void setFirstName(String fN) {
		firstName = fN;
	}
	public void setLastName(String lN) {
		lastName = lN;
	}

	public void setScore1(int s1) {
		score1 = s1;
	}

	public void setScore2(int s2) {
		score2 = s2;
	}

	public void setScore3(int s3) {
		score3 = s3;
	}
	//accessor methods 
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getScore1() {
		return score1;
	}

	public int getScore2() {
		return score2;
	}

	public int getScore3() {
		return score3;
	}
	public int calculateTotalScore() {
		return score1 + score2 + score3;
	}

	public int calculateAverageScore() {
		return (score1 + score2 + score3) / 3;
	}
}