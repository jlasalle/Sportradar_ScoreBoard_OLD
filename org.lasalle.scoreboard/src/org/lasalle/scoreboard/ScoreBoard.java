package org.lasalle.scoreboard;

import java.util.HashSet;
import java.util.Set;

/**
 * Score Board dedicated to Football World cup.
 * 
 * @author lasalle
 */
public class ScoreBoard {

	/**
	 * Set of all games managed by the score board
	 */
	Set<Game> _allGames = new HashSet<>();

	/**
	 * Start a new game and add it in the games managed by the scoreboard
	 * 
	 * @param homeTeamName the name of the "home" team
	 * @param awayTeamName the name of the "away" team
	 * @return the created Game
	 */
	public Game startGame(String homeTeamName, String awayTeamName) {
		Game newGame = new Game(homeTeamName, awayTeamName);
		_allGames.add(newGame);
		return newGame;
	}

	/**
	 * Finish a game and remove it from the list of games managed by the scoreboard
	 * 
	 * @param game Game to remove for the ScoreBoard
	 */
	public void finishGame(Game game) {
		_allGames.remove(game);
	}

	/**
	 * Update the scores of the given game
	 * 
	 * @param game             concerned game
	 * @param homeTeamNewScore new score for the home team
	 * @param awayTeamNewScore new score for the away team
	 */
	public void updateScore(Game game, int homeTeamNewScore, int awayTeamNewScore) {
		if (game != null) {
			game.setHomeTeamScore(homeTeamNewScore);
			game.setAwayTeamScore(awayTeamNewScore);
		}
	}
	
	/**
	 * Check if the ScoreBoard contains the given Game
	 * 
	 * @param game the Game to search in the ScoreBoard
	 * @return true if the Game is managed by the ScoreBoard
	 */
	public boolean contains(Game game) {
		return _allGames.contains(game);
	}
}
