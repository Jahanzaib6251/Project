import java.util.Objects;

public class Players {

	private int playerID;
	private String fullName;
	private String age;
	private String registrationDate;
	private String gender;
	private String nationality;
	private String email;
	private String last_club_played;
	private String last_league;
	private int salary;
	private int mobileNumber;
	
	// constructor
	public Players(int playerID, String fullName, String age, String registrationDate, String gender,
			String nationality, String email, String last_club_played, String last_league, int salary,
			int mobileNumber) {
		super();
		this.playerID = playerID;
		this.fullName = fullName;
		this.age = age;
		this.registrationDate = registrationDate;
		this.gender = gender;
		this.nationality = nationality;
		this.email = email;
		this.last_club_played = last_club_played;
		this.last_league = last_league;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
	}

	//getters ... setters
	
	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLast_club_played() {
		return last_club_played;
	}

	public void setLast_club_played(String last_club_played) {
		this.last_club_played = last_club_played;
	}

	public String getLast_league() {
		return last_league;
	}

	public void setLast_league(String last_league) {
		this.last_league = last_league;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Players [playerID=" + playerID + ", fullName=" + fullName + ", age=" + age + ", registrationDate="
				+ registrationDate + ", gender=" + gender + ", nationality=" + nationality + ", email=" + email
				+ ", last_club_played=" + last_club_played + ", last_league=" + last_league + ", salary=" + salary
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, email, fullName, gender, last_club_played, last_league, mobileNumber, nationality,
				playerID, registrationDate, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Players other = (Players) obj;
		return Objects.equals(age, other.age) && Objects.equals(email, other.email)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(gender, other.gender)
				&& Objects.equals(last_club_played, other.last_club_played)
				&& Objects.equals(last_league, other.last_league) && mobileNumber == other.mobileNumber
				&& Objects.equals(nationality, other.nationality) && playerID == other.playerID
				&& Objects.equals(registrationDate, other.registrationDate) && salary == other.salary;
	}
	
	//getters ... setters
	
	
	
	
}
