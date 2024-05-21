package org.lasalle.scoreboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests dedicated to the "Start Game"
 * Feature : "Start a game. When a game starts, it should capture
 * a. Home team
 * b. Away Team
 * (initial score 0-0)
 * 
 * @author lasalle
 */
public class ScoreBoard_StartGameTests {
	
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

	/**
	 * Check that the "start game" action well add a new game in the ScoreBoard.
	 * Check also
	 */
	@Test
	public void startGameTest() {
		Game game = _scoreBoard.startGame(HOME_TEAM_NAME, AWAY_TEAM_NAME);
		
		//Check that the game is well inserted
		assertTrue(_scoreBoard.contains(game));		

		//Check that the game is well configured (good name, score at 0 by default)
		assertEquals(HOME_TEAM_NAME, game.getHomeTeamName());
		assertEquals(0, game.getHomeTeamScore());
		assertEquals(AWAY_TEAM_NAME, game.getAwayTeamName());
		assertEquals(0, game.getAwayTeamScore());	
	}
}
