package org.lasalle.scoreboard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests dedicated to the "Start Game" feature. When a game starts, it should
 * capture:- a. Home team - b. Away Team (initial score 0-0)
 * 
 * @author lasalle
 */
public class ScoreBoard_StartGameTests extends ScoreBoardTest {

	/**
	 * Check that the "start game" action effectively add a new game in the
	 * ScoreBoard. Check also the default values of game attributes.
	 */
	@Test
	public void startGameTest() {
		Game game = _scoreBoard.startGame(A_TEAM, B_TEAM);

		// Check that the game is well inserted
		assertTrue(_scoreBoard.contains(game));

		// Check that the game is well configured (good name, score at 0 by default)
		assertEquals(A_TEAM, game.getHomeTeamName());
		assertEquals(0, game.getHomeTeamScore());
		assertEquals(B_TEAM, game.getAwayTeamName());
		assertEquals(0, game.getAwayTeamScore());
	}
}
