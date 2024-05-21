package org.lasalle.scoreboard;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Tests dedicated to the "Finish Game" feature. Remove a game from the
 * scoreboard.
 * 
 * @author lasalle
 */
public class ScoreBoard_FinishGameTests extends ScoreBoardTest {


	/**
	 * Test that the "finish game" feature effectively remove the game from the
	 * score board
	 */
	@Test
	public void finishGameTest() {
		Game game = _scoreBoard.startGame(A_TEAM, B_TEAM);

		_scoreBoard.finishGame(game);

		// Check that the game is well inserted
		assertFalse(_scoreBoard.contains(game));
	}
}