package org.lasalle.scoreboard;

/**
 * Definition of a "Game" between to team (home and away)
 * 
 * @author lasalle
 */
public class Game {

	/**
	 * The name of the "Home" team
	 */
	private String _homeTeamName = null;

	/**
	 * The name of the "Away" team
	 */
	private String _awayTeamName = null;
	
	/**
	 * The score of the "Home" team
	 */
	private int _homeTeamScore = 0;
	
	/**
	 * The score of the "Away" team
	 */
	private int _awayTeamScore = 0;
	

	/**
	 * Main constructor
	 * 
	 * @param homeTeamName the name of the "home" team
	 * @param awayTeamName the name of the "away" team
	 */
	public Game(String homeTeamName, String awayTeamName) {
		_homeTeamName = homeTeamName;
		_awayTeamName = awayTeamName;
		
		_homeTeamScore = 0;
		_awayTeamScore = 0;
	}

	/**
	 * Get the "Home" team name
	 * @return the name of the "home" team
	 */
	public Object getHomeTeamName() {
		return _homeTeamName;
	}

	/**
	 * Get the "Away" team name
	 * @return the name of the "away" team
	 */
	public Object getAwayTeamName() {
		return _awayTeamName;
	}

	/**
	 * Get the "Home" team score
	 * @return the score of the "home" team
	 */
	public int getHomeTeamScore() {
		return _homeTeamScore;
	}

	/**
	 * Get the "Away" team score
	 * @return the score of the "away" team
	 */
	public int getAwayTeamScore() {
		return _awayTeamScore;
	}

	/**
	 * Update the "Home" team score
	 * 
	 * @param homeTeamNewScore the new score
	 */
	public void setHomeTeamScore(int homeTeamNewScore) {
		_homeTeamScore = homeTeamNewScore;
	}

	/**
	 * Update the "Away" team score
	 * 
	 * @param awayTeamNewScore the new score
	 */
	public void setAwayTeamScore(int awayTeamNewScore) {
		_awayTeamScore = awayTeamNewScore;
	}

}
