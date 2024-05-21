package org.lasalle.scoreboard;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

	/**
	 * Get the summary of all games of the score board
	 * 
	 * @return a String value
	 */
	public String getGamesSummary() {

		// Order all the games by total score
		List<Game> orderedList = _allGames.stream().sorted(new Comparator<Game>() {
			@Override
			public int compare(Game g1, Game g2) {
				return (g2.getHomeTeamScore() + g2.getAwayTeamScore())
						- (g1.getHomeTeamScore() + g1.getAwayTeamScore());
			}
		}).collect(Collectors.toList());

		// Generate the result
		String result = "";
		int index = 1;
		for(Game g : orderedList)
		{
			if(g != null)
			{
				result += genSingleLine(index, g);
				index++;
			}
		}
		return result;
	}

	/**
	 * Generate the summary line for a given game at the given index
	 * 
	 * @param index index of the game in the list
	 * @param game the concerned game
	 * @return a String value
	 */
	private String genSingleLine(int index, Game game) {
		return String.format("%s. %s %s - %s %s\n", index, game.getHomeTeamName(), game.getHomeTeamScore(),
				game.getAwayTeamName(), game.getAwayTeamScore());
	}
}
