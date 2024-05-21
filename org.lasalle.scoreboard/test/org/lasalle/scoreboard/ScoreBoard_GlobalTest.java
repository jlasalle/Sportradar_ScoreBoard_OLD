package org.lasalle.scoreboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Integration tests (with the example provided by the client) / Demo case
 * 
 * @author lasalle
 */
public class ScoreBoard_GlobalTest extends ScoreBoardTest {

	// 1st game - home team
	private static final String MEX = "Mexico";
	// 1st game - home team score
	private static final int MEX_SCORE = 0;
	// 1st game - away team
	private static final String CAN = "Canada";
	// 1st game - away team score
	private static final int CAN_SCORE = 5;

	// 2nd game - home team
	private static final String SPA = "Spain";
	// 2nd game - home team score
	private static final int SPA_SCORE = 10;
	// 2nd game - away team
	private static final String BRA = "Brazil";
	// 2nd game - away team score
	private static final int BRA_SCORE = 2;

	// 3rd game - home team
	private static final String GER = "Germany";
	// 3rd game - home team score
	private static final int GER_SCORE = 2;
	// 3rd game - away team
	private static final String FRA = "France";
	// 3rd game - away team score
	private static final int FRA_SCORE = 2;

	// 4th game - home team
	private static final String URU = "Uruguay";
	// 4th game - home team score
	private static final int URU_SCORE = 6;
	// 4th game - away team
	private static final String ITA = "Italy";
	// 4th game - away team score
	private static final int ITA_SCORE = 6;

	// 5th game - home team
	private static final String ARG = "Argentina";
	// 5th game - home team score
	private static final int ARG_SCORE = 3;
	// 5th game - away team
	private static final String AUS = "Australia";
	// 5th game - away team score
	private static final int AUS_SCORE = 1;

	@Test
	public void globalTest_A() {
		// Game insertion
		Game mexCanGame = _scoreBoard.startGame(MEX, CAN);
		Game spaBraGame = _scoreBoard.startGame(SPA, BRA);
		Game gerFraGame = _scoreBoard.startGame(GER, FRA);
		Game uruItaGame = _scoreBoard.startGame(URU, ITA);
		Game argAusGame = _scoreBoard.startGame(ARG, AUS);

		_scoreBoard.updateScore(mexCanGame, MEX_SCORE, CAN_SCORE);
		_scoreBoard.updateScore(spaBraGame, SPA_SCORE, BRA_SCORE);
		_scoreBoard.updateScore(gerFraGame, GER_SCORE, FRA_SCORE);
		_scoreBoard.updateScore(uruItaGame, URU_SCORE, ITA_SCORE);
		_scoreBoard.updateScore(argAusGame, ARG_SCORE, AUS_SCORE);

		String result = genSummaryLine(1, uruItaGame) + genSummaryLine(2, spaBraGame) + genSummaryLine(3, mexCanGame)
				+ genSummaryLine(4, argAusGame) + genSummaryLine(5, gerFraGame);
		assertEquals(result, _scoreBoard.getGamesSummary());
	}
}
