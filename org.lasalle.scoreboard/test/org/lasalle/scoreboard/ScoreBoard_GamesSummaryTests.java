package org.lasalle.scoreboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests dedicated to the "Game summary" feature. Get a summary of games by
 * total score. Those games with the same total score will be returned ordered
 * by the most recently added to our system.
 * 
 * @author lasalle
 */
public class ScoreBoard_GamesSummaryTests extends ScoreBoardTest {

	/**
	 * Check that the "games summary" feature return the right String expression
	 */
	@Test
	public void gamesSummaryTest() {
		Game game = _scoreBoard.startGame(A_TEAM, B_TEAM);
		assertEquals(genSummaryLine(1, game), _scoreBoard.getGamesSummary());
	}

	/**
	 * Check that the "games summary" feature return the right String expression.
	 * Change order : 2 games, the second one having a higher total score (having
	 * then to be displayed first).
	 */
	@Test
	public void gamesSummaryTest_changeOrder() {
		// Configure the score Board like this :
		// A - B : 0 0
		// C - D : 1 0
		Game abGame = _scoreBoard.startGame(A_TEAM, B_TEAM);
		Game cdGame = _scoreBoard.startGame(C_TEAM, D_TEAM);
		cdGame.setHomeTeamScore(1);

		String result = genSummaryLine(1, cdGame) + genSummaryLine(2, abGame);
		assertEquals(result, _scoreBoard.getGamesSummary());
	}

	/**
	 * Check that the "games summary" feature return the right String expression. 3
	 * games with the same total: the most recent must be displayed first.
	 */
	@Test
	public void gamesSummaryTest_equalityCase() {
		Game abGame = _scoreBoard.startGame(A_TEAM, B_TEAM);
		Game cdGame = _scoreBoard.startGame(C_TEAM, D_TEAM);
		Game efGame = _scoreBoard.startGame(E_TEAM, F_TEAM);

		String result = genSummaryLine(1, efGame) + genSummaryLine(2, cdGame) + genSummaryLine(3, abGame);
		assertEquals(result, _scoreBoard.getGamesSummary());
	}
}
