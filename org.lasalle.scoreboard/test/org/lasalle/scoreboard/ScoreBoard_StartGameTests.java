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
	 * Check that the "start game" action well add a new game in the ScoreBoard
	 */
	@Test
	public void startGameTest() {
		Game game = _scoreBoard.startGame("HomeTeamName", "AwayTeamName");
		
		assertTrue(_scoreBoard.contains(game));		
	}
}
