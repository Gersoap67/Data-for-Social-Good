/**
 * TeamInfo class
 * Stores one NBA team's city, name, and founding year.
 */
public class TeamInfo {

  private String city;
  private String team;
  private int yearfounded;

  public TeamInfo(String city, String team, int yearfounded) {
    this.city = city;
    this.team = team;
    this.yearfounded = yearfounded;
  }

  public String getCity() {
    return city;
  }

  public String getTeam() { 
    return team;
  }

  public int getYear() { 
    return yearfounded;
  }

  public String toString() {
    return "City: " + city + " - Team: " + team + " - Founded: " + yearfounded;
  }
}
