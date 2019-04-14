package oneRowNim;

/**
 * The OneRowNim class
 * This class simulates a simple game of One Row Nim. 
 * Two players take turns taking 1, 2 or 3 sticks until there are no sticks left. 
 * The player who takes the last stick is the loser.
 * The number of sticks at the start of the game is set by the constructor.
 */
public class OneRowNim
{
  /** The number of sticks at the start of the game
   */
  private int numSticks;

  /** The player number of the next player (either one or two)
   */
  private int player;

	/**
	 * Initializes the player and the number of sticks for the start of the game.
	 * The player is set to 1 and the number of sticks is set to the parameter
	 * value.
	 * 
	 * @param nSticks
	 */
	public void startGame(int nSticks)
	{
		player = 1;
		numSticks = nSticks;
	} // startGame(int)
	
  /**
   * Returns the number of sticks left in the game
   * @return the current number of sticks
   */
  public int getNumSticks()
  {
    return numSticks;
  } // getNumSticks()

  /**
   * Returns the identity of the next player.
   * @return the player number of the next player
   */
  public int getPlayer()
  {
    return player;
  } // getPlayer()

  /**
   * Remove one stick from the game and change players.
   */
  public void takeOne()
  {
    numSticks = numSticks - 1;
    player = 3 - player;
  } // takeOne()

  /**
   * Remove two sticks from the game and change players.
   */
  public void takeTwo()
  {
    numSticks = numSticks - 2;
    player = 3 - player;
  } // takeTwo()

  /**
   * Remove three sticks from the game and change players.
   */
  public void takeThree()
  {
    numSticks = numSticks - 3;
    player = 3 - player;
    
  }
  
  //Everything in the "on your own" section
  //if statement declaring true or false depending on if numSticks <= 0
  public boolean isGameOver()
  {
  if (numSticks <= 0)
  	return true;
  else 
  	return false;
  }
  public void takeSticks(int nSticks)
  {
  if (numSticks < nSticks)
  	return;
  else 
  	numSticks -= nSticks;
  	player = 3 - player;
  	
  	
  } // takeThree()
} // OneRowNim class
