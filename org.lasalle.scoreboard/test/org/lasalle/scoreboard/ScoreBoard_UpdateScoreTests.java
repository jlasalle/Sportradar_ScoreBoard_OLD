package org.lasalle.scoreboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests dedicated to the "update score" feature. Receiving the pair score; home
 * team score and away team score. Updates a game score.
 * 
 * @author lasalle
 */
public class ScoreBoard_UpdateScoreTests extends ScoreBoardTest {

	/**
	 * New score for the "Home" team
	 */
	private static final int A_TEAM_NEW_SCORE = 1;

	/**
	 * New score for the "Away" team
	 */
	private static final int B_TEAM_NEW_SCORE = 2;

	/**
	 * Check that the "update score game" action well add a new game in the
	 * ScoreBoard.
	 */
	@Test
	public void updateScoreTest() {
		// Creation of the game
		Game game = _scoreBoard.startGame(A_TEAM, B_TEAM);

		assertEquals(DEFAULT_SCORE, game.getHomeTeamScore());
		assertEquals(DEFAULT_SCORE, game.getAwayTeamScore());

		// Update the score
		_scoreBoard.updateScore(game, A_TEAM_NEW_SCORE, B_TEAM_NEW_SCORE);

		// Check the new score
		assertEquals(A_TEAM_NEW_SCORE, game.getHomeTeamScore());
		assertEquals(B_TEAM_NEW_SCORE, game.getAwayTeamScore());
	}
}
