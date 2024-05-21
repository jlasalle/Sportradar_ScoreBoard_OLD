package org.lasalle.scoreboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests dedicated to the "Finish Game" feature
 * Finish a game. It will remove a match from the scoreboard.
 * 
 * @author lasalle
 */
public class ScoreBoard_FinishGameTests {

	/**
	 * Home team name used for the test
	 */
	private static final String HOME_TEAM_NAME = "HomeTeamName";

	/**
	 * Away team name used for the test
	 */
	private static final String AWAY_TEAM_NAME = "AwayTeamName";
	
	
	/**
	 * The tested ScoreBoard
	 */
	private ScoreBoard _scoreBoard = null;
	
	/**
	 * Initialization of the ScoreBoard
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		_scoreBoard = new ScoreBoard();
	}

	@Test
	public void test() {
		Game game = _scoreBoard.startGame(HOME_TEAM_NAME, AWAY_TEAM_NAME);
		
		_scoreBoard.finishGame(game);
		
		//Check that the game is well inserted
		assertFalse(_scoreBoard.contains(game));
	}
}