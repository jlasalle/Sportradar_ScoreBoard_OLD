package org.lasalle.scoreboard;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests dedicated to the "Game summary" feature. Get a summary of games by
 * total score. Those games with the same total score will be returned ordered
 * by the most recently added to our system.
 * 
 * @author lasalle
 */
public class ScoreBoard_GamesSummaryTests {

	/**
	 * Home team name used for the test
	 */
	private static final String HOME_TEAM_NAME = "HomeTeamName";

	/**
	 * Away team name used for the test
	 */
	private static final String AWAY_TEAM_NAME = "AwayTeamName";

	/**
	 * Default scores associated to new game
	 */
	private static final int DEFAULT_SCORE = 0;

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
	 * Check that the "games summary" feature return the right String expression
	 */
	@Test
	public void gamesSummaryTest() {
		_scoreBoard.startGame(HOME_TEAM_NAME, AWAY_TEAM_NAME);

		String result = String.format("1. %s %s - %s %s", HOME_TEAM_NAME, DEFAULT_SCORE, AWAY_TEAM_NAME, DEFAULT_SCORE);
		assertEquals(result, _scoreBoard.getGamesSummary());
	}
}
