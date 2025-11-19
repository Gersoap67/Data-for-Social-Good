public class UserStory {

  private TeamInfo[] place;
  
  public UserStory(String citysFile, String teamsFile, String yearsFile) {
    this.place = createCitys(citysFile, teamsFile, yearsFile);
  }

  /**
  * Reads data from files and builds the TeamInfo array.
  */  
  public TeamInfo[] createCitys(String citysFile, String teamsFile, String yearsFile) {
    String[] citys = FileReader.toStringArray(citysFile);
    String[] teams = FileReader.toStringArray(teamsFile);
    int[] years = FileReader.toIntArray(yearsFile);
    TeamInfo[] placeArray = new TeamInfo[citys.length];
    for (int i = 0; i < citys.length; i++) {
      placeArray[i] = new TeamInfo(citys[i], teams[i], years[i]);
    }
    return placeArray;
  }

  // Method #1 
  // Checks if two teams share the same founding year
  public boolean checkForDuplicates() {
    for (int i = 0; i < place.length; i++) {
      for (int j = i + 1; j < place.length; j++) {
        if (place[i].getYear() == place[j].getYear()) {
          return true;
        }
      }
    }
    return false;
  }

// Method #2
// Finds all oldest teams in the dataset (teams with the smallest founding year)
public TeamInfo[] findOldestTeams() {
    //find the minimum year
    int minYear = place[0].getYear();
    for (int i = 1; i < place.length; i++) {
        if (place[i].getYear() < minYear) {
            minYear = place[i].getYear();
        }
    }
    //count how many teams have that year
    int count = 0;
    for (TeamInfo t : place) {
        if (t.getYear() == minYear) {
            count++;
        }
    }
    //create an array for oldest teams
    TeamInfo[] oldestTeams = new TeamInfo[count];
    int index = 0;
    for (TeamInfo t : place) {
        if (t.getYear() == minYear) {
            oldestTeams[index] = t;
            index++;
        }
    }
    return oldestTeams;
}

  /**
  * Returns formatted info about all teams.
  */
  public String toString() {
    String result = "NBA Teams Dataset: \n";
    for (TeamInfo t : place) {
      result += t + "\n";
    }
    result += "\nTotal Teams: " + place.length + "\n";
    return result;
  }
}
