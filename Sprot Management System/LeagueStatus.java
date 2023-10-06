import java.util.Objects;

public class LeagueStatus {
	
	private int totalGames;
	private int totalTeams;
	private int leagueposition;
	private int  last_5_Gamesinfo;
	private int  totalPoints;
	private int goalDiff;
	private int games_Played;
	private int games_Lost;
	private int games_Won;
	private int games_Drawn;
	
	public LeagueStatus(int totalGames, int totalTeams, int leagueposition, int last_5_Gamesinfo, int totalPoints,
			int goalDiff, int games_Played, int games_Lost, int games_Won, int games_Drawn) {
		super();
		this.totalGames = totalGames;
		this.totalTeams = totalTeams;
		this.leagueposition = leagueposition;
		this.last_5_Gamesinfo = last_5_Gamesinfo;
		this.totalPoints = totalPoints;
		this.goalDiff = goalDiff;
		this.games_Played = games_Played;
		this.games_Lost = games_Lost;
		this.games_Won = games_Won;
		this.games_Drawn = games_Drawn;
	}

	public int getTotalGames() {
		return totalGames;
	}

	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}

	public int getTotalTeams() {
		return totalTeams;
	}

	public void setTotalTeams(int totalTeams) {
		this.totalTeams = totalTeams;
	}

	public int getLeagueposition() {
		return leagueposition;
	}

	public void setLeagueposition(int leagueposition) {
		this.leagueposition = leagueposition;
	}

	public int getLast_5_Gamesinfo() {
		return last_5_Gamesinfo;
	}

	public void setLast_5_Gamesinfo(int last_5_Gamesinfo) {
		this.last_5_Gamesinfo = last_5_Gamesinfo;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public int getGoalDiff() {
		return goalDiff;
	}

	public void setGoalDiff(int goalDiff) {
		this.goalDiff = goalDiff;
	}

	public int getGames_Played() {
		return games_Played;
	}

	public void setGames_Played(int games_Played) {
		this.games_Played = games_Played;
	}

	public int getGames_Lost() {
		return games_Lost;
	}

	public void setGames_Lost(int games_Lost) {
		this.games_Lost = games_Lost;
	}

	public int getGames_Won() {
		return games_Won;
	}

	public void setGames_Won(int games_Won) {
		this.games_Won = games_Won;
	}

	public int getGames_Drawn() {
		return games_Drawn;
	}

	public void setGames_Drawn(int games_Drawn) {
		this.games_Drawn = games_Drawn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(games_Drawn, games_Lost, games_Played, games_Won, goalDiff, last_5_Gamesinfo,
				leagueposition, totalGames, totalPoints, totalTeams);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeagueStatus other = (LeagueStatus) obj;
		return games_Drawn == other.games_Drawn && games_Lost == other.games_Lost && games_Played == other.games_Played
				&& games_Won == other.games_Won && goalDiff == other.goalDiff
				&& last_5_Gamesinfo == other.last_5_Gamesinfo && leagueposition == other.leagueposition
				&& totalGames == other.totalGames && totalPoints == other.totalPoints && totalTeams == other.totalTeams;
	}
	
	
	
	
	
}
