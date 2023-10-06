import java.util.Objects;

public class PayRoll {

	private int playerID1;
	private int playerName;
	private int matchNo;
	private int goalNo;
	private int salary;
	private int salary_increment;
	private int entry_date;
	
	//constructors
	
	
	public PayRoll(int playerID1, int playerName, int matchNo, int goalNo, int salary, int salary_increment,
			int entry_date) {
		super();
		this.playerID1 = playerID1;
		this.playerName = playerName;
		this.matchNo = matchNo;
		this.goalNo = goalNo;
		this.salary = salary;
		this.salary_increment = salary_increment;
		this.entry_date = entry_date;
	}

	public int getPlayerID1() {
		return playerID1;
	}

	public void setPlayerID1(int playerID1) {
		this.playerID1 = playerID1;
	}

	public int getPlayerName() {
		return playerName;
	}

	public void setPlayerName(int playerName) {
		this.playerName = playerName;
	}

	public int getMatchNo() {
		return matchNo;
	}

	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}

	public int getGoalNo() {
		return goalNo;
	}

	public void setGoalNo(int goalNo) {
		this.goalNo = goalNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary_increment() {
		return salary_increment;
	}

	public void setSalary_increment(int salary_increment) {
		this.salary_increment = salary_increment;
	}

	public int getEntry_date() {
		return entry_date;
	}

	public void setEntry_date(int entry_date) {
		this.entry_date = entry_date;
	}

	@Override
	public String toString() {
		return "PayRoll [playerID1=" + playerID1 + ", playerName=" + playerName + ", matchNo=" + matchNo + ", goalNo="
				+ goalNo + ", salary=" + salary + ", salary_increment=" + salary_increment + ", entry_date="
				+ entry_date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(entry_date, goalNo, matchNo, playerID1, playerName, salary, salary_increment);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PayRoll other = (PayRoll) obj;
		return entry_date == other.entry_date && goalNo == other.goalNo && matchNo == other.matchNo
				&& playerID1 == other.playerID1 && playerName == other.playerName && salary == other.salary
				&& salary_increment == other.salary_increment;
	}
	
	

	
}
