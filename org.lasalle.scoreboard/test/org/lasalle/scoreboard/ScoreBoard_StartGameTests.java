package org.lasalle.scoreboard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
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

	/**
	 * Try to execute a "start game" action with a "null" name for one of the teams
	 * => the game must not me created
	 */
	@Test
	public void startGameTest_nullName() {
		//Only "home" is null
		Game game = _scoreBoard.startGame(A_TEAM, null);
		assertNull(game);
		assertTrue(_scoreBoard._allGames.isEmpty());
	}
}
