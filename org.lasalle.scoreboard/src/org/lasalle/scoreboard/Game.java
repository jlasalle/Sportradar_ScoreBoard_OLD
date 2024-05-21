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
	private static String _homeTeamName = null;

	/**
	 * The name of the "Away" team
	 */
	private static String _awayTeamName = null;

	/**
	 * Main constructor
	 * 
	 * @param homeTeamName the name of the "home" team
	 * @param awayTeamName the name of the "away" team
	 */
	public Game(String homeTeamName, String awayTeamName) {
		_homeTeamName = homeTeamName;
		_awayTeamName = awayTeamName;
	}

	public Object getHomeTeamName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAwayTeamName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getHomeTeamScore() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAwayTeamScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
