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
	 * Method dedicated to starting a new game and adding it in the games manages by
	 * the scoreboard
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
	
	public void finishGame(Game game) {
		// TODO Auto-generated method stub
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
