/**
 * 
 */
package bowler;

/**
 * @author pdumaresq
 *
 */
import java.util.Scanner;

public class BowlingTeam {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		bowler myTeam = new bowler();
		String fN, lN;
		int s1, s2, s3;
		
		System.out.print("Enter bowler's name (first then last): ");
		fN = keyboard.next();
		lN = keyboard.next();
		myTeam.setFirstName(fN);
		myTeam.setLastName(lN);
		
		System.out.print("Enter bowler's first score: ");
		s1 = keyboard.nextInt();
		myTeam.setScore1(s1);
		
		
		
		System.out.print("Enter bowler's second score: ");
		s2 = keyboard.nextInt();
		myTeam.setScore2(s2);
		
		
		System.out.print("Enter bowler's third score: ");
		s3 = keyboard.nextInt();
		myTeam.setScore3(s3);
		
		
		
		System.out.println("Bowl-Em Lanes \n-------------");
		
		
		System.out.println("Bowler		Game 1	Game2	Game3	Total	Average \n"
		 + "Name		Score	Score	Score	Score	Score \n"
		 + "------		------	------	------	-----	-------");
		
		
		
		
		System.out.println(myTeam.getFirstName() + " " + myTeam.getLastName() + "	" 
		+ myTeam.getScore1() + "	" + myTeam.getScore2() + "	" + myTeam.getScore3() + "	"
		+ myTeam.calculateTotalScore() + "	" + myTeam.calculateAverageScore());
		
		
		
		
		
		
		
		/*
		 Not what we were supposed to be doing, but I went 
		 on autopilot and did the whole thing 
		 in one class and this worked.
		*/
		
		/* 
		
		 Scanner sc = new Scanner(System.in);
		 bowler team = new bowler();
		 String firstName, lastName;
		 int score1, score2, score3;
		 int totalScore, averageScore;

		 System.out.print("Enter bowler's name (first then last): ");
		 firstName = sc.next();
		 lastName = sc.next();

		 System.out.print("Enter 1st score: ");
		 score1 = sc.nextInt();

		 System.out.print("Enter 2nd score: ");
		 score2 = sc.nextInt();

		 System.out.print("Enter 3rd score: ");
		 score3 = sc.nextInt();

		 System.out.println("Bowl-Em Lanes \n-------------");

		 System.out.println("Bowler		Game 1	Game2	Game3	Total	Average \n"
		 + "Name		Score	Score	Score	Score	Score \n"
		 + "------		------	------	------	-----	-------");

		 totalScore = score1 + score2 + score3;
		 averageScore = (score1 + score2 + score3) / 3;
		 System.out.println(firstName + " " + lastName + "	" + score1 + "	"
		 + score2 + "	" + score3 + "	" + totalScore + "	"
		 + averageScore); 
		
		*/
	}
}