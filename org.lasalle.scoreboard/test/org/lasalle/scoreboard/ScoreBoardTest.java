package org.lasalle.scoreboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test skeleton to mutualize action and final values
 * 
 * @author lasalle
 */
public class ScoreBoardTest {

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
}
