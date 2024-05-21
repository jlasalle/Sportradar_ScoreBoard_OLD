package org.lasalle.scoreboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests dedicated to the "update score" feature. Receiving the pair score; home
 * team score and away team score. Updates a game score.
 * 
 * @author lasalle
 */
public class ScoreBoard_UpdateScoreTests {

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
	 * New score for the "Home" team
	 */
	private static final int HOME_TEAM_NEW_SCORE = 1;

	/**
	 * New score for the "Away" team
	 */
	private static final int AWAY_TEAM_NEW_SCORE = 2;

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
	 * Check that the "update score game" action well add a new game in the ScoreBoard.
	 */
	@Test
	public void updateScoreTest() {
		//Creation of the game
		Game game = _scoreBoard.startGame(HOME_TEAM_NAME, AWAY_TEAM_NAME);

		assertEquals(DEFAULT_SCORE, game.getHomeTeamScore());
		assertEquals(DEFAULT_SCORE, game.getAwayTeamScore());

		//Update the score
		_scoreBoard.updateScore(game, HOME_TEAM_NEW_SCORE, AWAY_TEAM_NEW_SCORE);

		//Check the new score
		assertEquals(HOME_TEAM_NEW_SCORE, game.getHomeTeamScore());
		assertEquals(AWAY_TEAM_NEW_SCORE, game.getAwayTeamScore());
	}
}
